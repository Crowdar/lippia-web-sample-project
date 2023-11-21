package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.GoogleHomeService;
import lippia.web.services.GoogleSearchResultService;

public class GoogleSearchSteps extends PageSteps {

    @Given("^El cliente se encuentra en el buscador$")
    public void home() {
        GoogleHomeService.navegarWeb();
    }


    @When("^El cliente hace la (.*)$")
    public void search(String criteria) {
        GoogleHomeService.enterSearchCriteria(criteria);
        GoogleHomeService.clickSearchButton();
    }

    @Then("El cliente puede ver su busqueda")
    public void statVerification() {
        GoogleSearchResultService.verifyResults();
    }
}
