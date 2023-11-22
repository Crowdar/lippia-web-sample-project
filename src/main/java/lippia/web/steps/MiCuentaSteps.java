package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MiCuentaService;


public class MiCuentaSteps extends PageSteps {
    @And("Se dirige a los detalles de su cuenta")
    public void Detalles() {
        MiCuentaService.detalles();
    }

    @Then("El cliente ve los detalles de su cuenta")
    public void verificacionDetalles() {
        MiCuentaService.verificacionDetalles();
    }

    @When("El cliente clickea en Logout")
    public void logout() {
        MiCuentaService.logout();
    }

    @Then("El cliente esta fuera de su cuenta")
    public void verificacionLogout() {
        MiCuentaService.verificarLogout();
    }

}
