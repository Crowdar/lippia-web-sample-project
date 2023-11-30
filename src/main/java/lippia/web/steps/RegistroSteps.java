package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.RegistroService;

public class RegistroSteps extends PageSteps {
    @When("^Ingresa su email (.*) y password (.*)$")
    public void valoresRegistros(String email,String password) {
        RegistroService.valoresRegistros(email, password);
    }
    @Then("^Observa el siguiente mensaje (.*)$")
    public void verificacion_Fallida(String mensaje) {
        RegistroService.verificar_Registro_Fallido(mensaje);
    }
}
