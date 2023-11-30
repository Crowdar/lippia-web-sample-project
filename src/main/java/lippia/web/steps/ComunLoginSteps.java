package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ComunLoginService;

public class ComunLoginSteps extends PageSteps {
    @And("Se dirige al Login")
    public void loginPage(){
        ComunLoginService.loginPage();
    }
    @When("Sale del sitio")
    public void salir() {
        ComunLoginService.salir();
    }
    @When("^Ingresa su usuario (.*) y password (.*) e ingresa a su cuenta$")
    public void valores(String username,String password) {
        ComunLoginService.ingresarLogin(username, password);
    }
    @Then("El cliente esta fuera de su cuenta")
    public void verificacionLoginPage() {
        ComunLoginService.verificacionLoginPage();
    }
}
