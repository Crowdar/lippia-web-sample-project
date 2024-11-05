package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.Given;

import static lippia.web.services.LandingPageService.clickOnSignIn;
import static lippia.web.services.LandingPageService.navigateWeb;
import static lippia.web.services.LoginPageService.*;
import static lippia.web.services.LoginPageService.clickOnLogInButton;

public class CommonSteps {

    @Given("the user successfully logs into the dashboard with the email {string} and the password {string}")
    public static void loginSucessfully(String email, String pass) {
        navigateWeb();
        clickOnSignIn();
        clickOnManually();
        setEmail(email);
        setPassword(pass);
        clickOnLogInButton();
    }

    public static void deleteInfoInput(String xpath, int length) {
        for (int i = 0; i<length; i++) {
            WebActionManager.setInput(xpath, "\b");
}}
}