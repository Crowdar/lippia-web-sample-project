package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.LandingPageConstants;
import lippia.web.constants.LoginPageConstants;
import lippia.web.services.LandingPageService;
import lippia.web.services.LoginPageService;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends PageSteps {

    @Given("El usuario está en la página de inicio de Clockify")
    public void home() {
        LandingPageService.navegarWeb();
    }

    @And("ingresa a la seccion 'Log In'")
    public void ingresaALaSeccionLogIn() {
        LandingPageService.clickOnLogIn();
    }

    @When("El usuario selecciona la opción 'Log in manually'")
    public void ingresaALaSeccionManually() {
        LoginPageService.clikOnManually();
    }

    @And("Ingresa '(.*)' en el campo 'Enter email'")
    public void ingresaEnElCampoEmail(String email) {
        LoginPageService.setEmail(email);

    }

    @And("Ingresa '(.*)' en el campo 'Enter password'")
    public void ingresaEnElCampoPassword(String pass) {
        LoginPageService.setPassword(pass);

    }
    @And("Presiona el botón 'Log In'")
    public void presionaElBotonLogIn() {
        LoginPageService.clickOnLogInButton();
    }
    @Then("El usuario ingresa exitosamente al dashboard de Clockify")
    public static void verifyDashboard() {

    }
    @Then("Se visualiza alerta '(.*)' indicando que el correo es inválido")
    public void seVisualizaAlertaEmail(String alert) {
        LoginPageService.verifyAlertEmail(alert);
    }
    @Then("Se visualiza alerta '(.*)' indicando que la contraseña es incorrecta")
    public void seVisualizaAlertaPass(String alert) {
        LoginPageService.verifyAlertPass(alert);
    }
    @And("Presiona el botón 'Log Out'")
    public void presionaElBotonLogOut() {
        LoginPageService.clickOnDropdown();
        LoginPageService.clickOnLogOutButton();

}
}