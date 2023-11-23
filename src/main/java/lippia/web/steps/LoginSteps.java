package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import lippia.web.services.LoginService;
import lippia.web.services.MiCuentaService;


public class LoginSteps extends PageSteps {
    @Then("^El cliente ve un (.*) de error$")
    public void verificacionError(String error) {
        LoginService.verificarError(error);
    }

    @And("Clickea en Logout")
    public void LogOut() {
        MiCuentaService.signOut();
    }

    @And("El cliente vuelve atras")
    public void Back() {
        LoginService.back();
    }
}
