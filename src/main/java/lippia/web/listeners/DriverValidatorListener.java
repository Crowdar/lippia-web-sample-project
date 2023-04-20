package lippia.web.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import java.util.List;

public class DriverValidatorListener extends AbstractWebDriverEventListener {

    List <DriverEventListenerValidation> validators;

    public DriverValidatorListener() {
        validators = Lists.of( new AdValidator() );
    }

    public DriverValidatorListener( DriverEventListenerValidation... validators ) {
        this.validators = Lists.of( validators );
    }

    @Override
    public void onException( Throwable throwable, WebDriver driver ) {
        for ( DriverEventListenerValidation validator : validators ) {
            validator.validate( throwable, driver );
        }

    }

}
