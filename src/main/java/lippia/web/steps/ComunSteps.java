package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.ComunService;

public class ComunSteps extends PageSteps {
    @Given("El cliente se encuentra en el login")
    public void loginPage(){
        ComunService.navegarWeb();
        ComunService.loginPage();
    }

    @When("^El cliente ingresa su usuario (.*) y password (.*) e ingresa a su cuenta$")
    public void valores(String username,String password) {
        ComunService.ingresarLogin(username, password);
    }
}
