package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {
    @Then("^El cliente ve un (.*) de error$")
    public void verificacionError(String error) {
        LoginService.verificarError(error);
    }
    @And("El cliente vuelve atras")
    public void Back() {
        LoginService.back();
    }
}
