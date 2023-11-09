package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BookstoreMyAccountService;

public class BookstoreMyAccountSteps extends PageSteps {

    @And("^The client clicks on (.*) link")
    public void navbarLinkClick(String link) {
        BookstoreMyAccountService.navbarLinkClick(link);
    }
    @Then("Verifies that the Dashboard is visible for the client")
    public void verifyDashboard() {
        BookstoreMyAccountService.pageValidation();
    }

    @Then("Verifies that the Orders are visible for the client")
    public void verifyOrders() {
        BookstoreMyAccountService.viewOrders();
    }

    @Then("Verifies that the client has successfully logout")
    public void verifyLogout() {
        BookstoreMyAccountService.loginFormValidation();
    }
}

