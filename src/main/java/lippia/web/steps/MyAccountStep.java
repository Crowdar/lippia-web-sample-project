package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.MyAccountConstants;
import lippia.web.services.MyAccountService;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class MyAccountStep extends PageSteps {

    @When("The client click on My Account")
    public void theClientClickOnMyAccount() {
        SuperiorBarNavigationBarService.clickMyAccount();
    }


    @And("The client completes the Username field with the value (.*)")
    public void theClientCompletesTheUsernameFieldWithTheValue(String username) {
        String xpath = "//*[@id=\"username\"]";
        MyAccountService.setInputValues(username, MyAccountConstants.MYACCOUNT_USERNAME, xpath);
    }

    @And("The client completes the Password field with the value (.*)")
    public void theClienteCompletesThePasswordFieldWithTheValue(String password) {
        String xpath = "//*[@id=\"password\"]";
        MyAccountService.setInputValues(password, MyAccountConstants.MYACCOUNT_PASSWORD, xpath);
    }

    @And("The client click on Login")
    public void theClientClickOnLogin() {
        MyAccountService.clickLogin();
    }

    @Then("The client logs into his account")
    public void theClientLogsIntoHisAccount() {
        MyAccountService.validateUser();
    }

    @Then("The client sees an incorrect user massage")
    public void theClientSeesAnIncorrectUserMassage() {
        MyAccountService.incorrectUser();
    }
}
