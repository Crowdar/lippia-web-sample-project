package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BookstoreHomeService;
import lippia.web.services.BookstoreMyAccountService;

public class BookstoreSteps extends PageSteps {

    @Given("^The client is on bookstore page$")
    public void home() {
        BookstoreHomeService.navegarWeb();
    }

    /*@When("^The client looks for the title (.*)$")
    public void search(String criteria) {
        BookstoreHomeService.buscarPalabra("new arrivals");
    }*/

    /*@Then("The client verify that books are shown properly")
    public void statVerification() {
        BookstoreMyAccountService.verifyResults();
    }*/
}
