package lippia.web.listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import java.util.Arrays;
import java.util.List;

public class ComprobacionPublicidad extends AbstractWebDriverEventListener {

    List <ValidacionListener> validador;
    boolean Comprobacion = false;

    public ComprobacionPublicidad() {
        validador = Arrays.asList( new CerrarPublicidad() );
    }

    @Override
    public void onException( Throwable throwable, WebDriver driver ) {
        if (Comprobacion)
            return;
        Comprobacion = true;
        for ( ValidacionListener validator : validador) {
            validator.validacion( throwable, driver );
        }
        Comprobacion = false;
    }

}
