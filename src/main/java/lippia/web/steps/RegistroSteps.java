package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.RegistroService;

public class RegistroSteps extends PageSteps {

    @Given("El cliente se dirige al registro")
    public void home() {
        RegistroService.navegarWeb();
    }


    @When("^El cliente registra su email (.*)$")
    public void valoresRegistros(String mail) {
        RegistroService.flujoExitosoEmail(mail);
    }

    @And("^Registra su password (.*)$")
    public void valoresPassword(String password) {
        RegistroService.flujoExitosoContraseña(password);
    }


    @When("^El cliente ingresa su email (.*) y password (.*)$")
    public void valoresRegistros(String email,String password) {
        RegistroService.dirigirLoginyCuenta(email, password);
    }

    @Then("El cliente se registra exitosamente")
    public void verificacion_Exitosa() {
        RegistroService.verificar_Registro_Exitoso();
    }

    @Then("^El cliente observa el siguiente mensaje (.*)$")
    public void verificacion_Fallida(String mensaje) {
        RegistroService.verificar_Registro_Fallido(mensaje);
    }

}
