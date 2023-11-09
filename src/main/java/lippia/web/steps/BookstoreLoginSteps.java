package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BookstoreLoginService;
import lippia.web.services.CommonService;

public class BookstoreLoginSteps extends PageSteps {

    @And("^The client enters (.*) in username textbox")
    public void enterUsername(String email) {
        BookstoreLoginService.enterUser(email);
    }

    @And("^The client enters (.*) in Password textbox")
    public void enterPass(String pass) {
        BookstoreLoginService.enterPass(pass);
    }

    @And("The client clicks on login button")
    public void loginButtonClick() {
        CommonService.loginButtonClick();
    }

    @Then("^Displays a message error with the text (.*)")
    public void verifyErrorMsg(String errormsg) {
        BookstoreLoginService.errorValidation(errormsg);
    }

    @And("Displays the login form for retrying login")
    public void verifyLoginForm() {
        BookstoreLoginService.loginFormValidation();
    }

}

