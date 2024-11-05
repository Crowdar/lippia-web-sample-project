package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LandingPageService;
import lippia.web.services.LoginPageService;


public class LoginSteps extends PageSteps {

    @Given("The user is on the Clockify homepage")
    public void home() {
        LandingPageService.navigateWeb();
    }

    @And("navigates to the 'Log In' section")
    public void navigatesToTheLoginSection() {
        LandingPageService.clickOnSignIn();
    }

    @When("The user selects the 'Log in manually' option")
    public void selectsLogInManuallyOption() {
        LoginPageService.clickOnManually();
    }

    @And("Enters '(.*)' in the 'Enter email' field")
    public void entersEmail(String email) {
        LoginPageService.setEmail(email);
    }

    @And("Enters '(.*)' in the 'Enter password' field")
    public void setPassword(String pass) {
        LoginPageService.setPassword(pass);
    }

    @And("Presses the 'Log In' button")
    public void pressesLogInButton() {
        LoginPageService.clickOnLogInButton();
    }

    @Then("The user successfully logs into the Clockify dashboard")
    public static void verifyDashboard() {
        LoginPageService.verifyDashboard();
    }

    @Then("An alert '(.*)' is displayed indicating that the email is invalid")
    public void verifyEmailAlert(String alert) {
        LoginPageService.verifyAlertEmail(alert);
    }

    @Then("An alert '(.*)' is displayed indicating that the password is incorrect")
    public void verifyPasswordAlert(String alert) {
        LoginPageService.verifyAlertPassword(alert);
    }

    @And("Presses the 'Log Out' button")
    public void pressesLogOutButton() {
        LoginPageService.clickOnDropdown();
        LoginPageService.clickOnLogOutButton();
    }
}
