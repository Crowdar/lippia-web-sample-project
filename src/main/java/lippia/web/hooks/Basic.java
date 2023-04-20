package lippia.web.hooks;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;

public class Basic {

    @Before( order = 0 )
    public void beforeScenario( Scenario scenario ) {
            DriverManager.getDriverInstance().register( new DriverValidatorListener() );
    }

}
