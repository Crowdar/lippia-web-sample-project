package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CommonService;

public class CommonSteps extends PageSteps {

    @Given("^The client is on bookstore page$")
    public void home() {
        CommonService.webNavigation();
        CommonService.homePageValidation();
    }

    @When("^The client clicks on (.*) on the menu bar$")
    public void navbarClick(String boton) {
        CommonService.navbarButtonClick(boton);
    }

    @And("^Verifies that the client navigates to (.*) page")
    public void verifyUrl(String url) {
        CommonService.urlValidation(url);
    }

}

