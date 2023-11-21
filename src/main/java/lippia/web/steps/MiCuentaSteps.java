package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.IngresarLoginService;
import lippia.web.services.MiCuentaService;


public class MiCuentaSteps extends PageSteps {

    @Given("El cliente se encuentra en el login")
    public void home() {
        MiCuentaService.navegarWeb();
    }
    //@When("^El cliente ingresa usuario (.*) y password (.*)$")
        public void valores(String username,String password) {
        IngresarLoginService.ingresarLogin(username, password);
    }
    @And("El cliente clickea sobre My Account")
    public void dash() {
        MiCuentaService.ingresarDashboard();
    }
    @Then("El cliente ve su Dashborad")
    public void verificacionDash() {
        MiCuentaService.verificarDashboard();
    }

    @When("El cliente se dirije a su Ordenes")
    public void ordenes() {
        MiCuentaService.ingresarOrdenes();
    }

    @Then("El cliente ve sus Ordenes")
    public void verificacionOrdenes() {
        MiCuentaService.verificarOrdenes();
    }

    @When("El cliente clickea en Logout")
    public void logout() {
        MiCuentaService.Logout();
    }

    @Then("El cliente esta fuera de su cuenta")
    public void statVerification() {
        MiCuentaService.verificarLogout();
    }

}
