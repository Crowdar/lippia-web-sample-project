package lippia.web.hooks;

import com.crowdar.driver.DriverManager;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import lippia.web.listener.ComprobacionPublicidad;

public class Publicidad {

    @Before( order = 0 )
    public void antesdeEmpezar(Scenario escenario ) {
            DriverManager.getDriverInstance().register( new ComprobacionPublicidad() );
    }

}
