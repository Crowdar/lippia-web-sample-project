package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import lippia.web.services.ComunService;
import lippia.web.services.LoginService;
import lippia.web.services.MiCuentaService;

public class LoginSteps extends PageSteps {
    @Then("^El cliente ve un (.*) de error$")
    public void verificacionError(String error) {
        LoginService.verificarError(error);
    }

    @And("El cliente se desloguea")
    public void LogOut() {
        MiCuentaService.logout();
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
