package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import lippia.web.services.IngresarLoginService;
import lippia.web.services.LoginService;
import lippia.web.services.MiCuentaService;

public class LoginSteps extends PageSteps {

    @Given("El cliente se dirige al login")
    public void home() {
        LoginService.navegarWeb();
    }

    @When("^El cliente ingresa su usuario (.*) y password (.*) e ingresa a su cuenta$")
    public void valores(String username,String password) {
        IngresarLoginService.ingresarLogin(username, password);
    }

    @Then("^El cliente ve un (.*) de error$")
    public void verificacionError(String error) {
        LoginService.verificarError(error);
    }

    @And("El cliente se desloguea")
    public void LogOut() {
        MiCuentaService.Logout();
    }

    @And("El cliente vuelve atras")
    public void Back() {
        LoginService.back();
    }

    @And("El cliente se encuentra en el home login")
    public void verificacionLoginPage() {
        LoginService.verificacionLoginPage();
    }


}
