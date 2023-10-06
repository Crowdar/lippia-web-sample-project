package lippia.web.hooks;

import org.testng.annotations.BeforeSuite;



import com.crowdar.driver.DriverManager;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import lippia.web.listeners.DriverValidatorListener;

public class Basic {

    @Before( order = 0 )
    public void beforeScenario( Scenario scenario ) {
        DriverManager.getDriverInstance().register( new DriverValidatorListener() );
    }

}
