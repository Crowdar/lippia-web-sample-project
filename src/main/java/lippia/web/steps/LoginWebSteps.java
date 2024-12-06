package lippia.web.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginWebServices;

public class LoginWebSteps {

    @Given("El usuario {string} se encuentra en la página de Login de Zelmira")
    public void elUsuarioSeEncuentraEnLaPáginaDeLoginDeZelmira(String role) {
        LoginWebServices.pageLogin(role);
    }

    @When("El usuario ingresa su email {string}")
    public void elUsuarioIngresaSuEmail(String email) {
        LoginWebServices.setEmail(email);
    }

    @And("El usuario ingresa su contraseña {string}")
    public void elUsuarioIngresaSuContraseña(String password) {
        LoginWebServices.setPassword(password);
    }

    @And("El usuario hace clic en el botón Ingresar")
    public void elUsuarioHaceClicEnElBotónIngresar() {
        LoginWebServices.clickOnEnterButton();
    }

    @Then("El usuario es redirigido a la vista {string}")
    public void elUsuarioEsRedirigidoALaVista(String view) {
        LoginWebServices.validateView(view);
    }

    @And("El usuario hace click en el checkbox Recordar Contraseña")
    public void elUsuarioHaceClickEnElCheckboxRecordarContraseña() {
        LoginWebServices.clickOnRememberCredentials();
    }

}
