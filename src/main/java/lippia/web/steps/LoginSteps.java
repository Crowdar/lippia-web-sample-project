package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.MyAccount;

public class LoginSteps extends PageSteps {

    @Given("^El cliente se dirige al login")
    public void home() {
        LoginService.navegarWeb();
    }

    @When("^Ingreso de su username (.*) y password (.*)$")
    public void valores(String username,String password) {
        MyAccount.ingresarLogin(username, password);
    }

    @Then("El cliente se logea exitosamente")
    public void verificacionExitosa() {
        LoginService.verificarResultadoExitoso();
    }

    @Then("El cliente no puede ingresar a su cuenta")
    public void verificacionFallida() {
        LoginService.verificarResultadoFallido();
    }

}
