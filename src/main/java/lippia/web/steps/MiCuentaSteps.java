package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.MiCuentaService;

public class MiCuentaSteps extends PageSteps {
    @And("Se dirige a los detalles de su cuenta")
    public void detalles() {
        MiCuentaService.detalles();
    }
    @Then("El cliente ve los detalles de su cuenta")
    public void verificacionDetalles() {
        MiCuentaService.verificacionDetalles();
    }
}
