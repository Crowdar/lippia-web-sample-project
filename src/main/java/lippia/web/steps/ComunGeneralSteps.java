package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import lippia.web.services.ComunGeneralService;


public class ComunGeneralSteps extends PageSteps {
    @Given("El cliente se encutra en la home page de practice.automationtesting.in")
    public void paginaPrincipal(){
        ComunGeneralService.navegarWeb();
    }
}
