package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.SinClaveFiscalButtonService;
import org.testng.Assert;


public class sinClaveFiscal extends PageSteps {



    private static final String FILTER_BY_POPULARITY = "xpath://*[@id='content']/form/select/option[2]";

    @Then("the user can view the popular products only")


    public void theUserCanViewThePopularProductsOnly() {

        Assert.assertTrue( ActionManager.waitPresence(FILTER_BY_POPULARITY).isDisplayed() );
    }


    @Given("the user enter the URL {string}")
    public void theUserEnterTheURL(String url) {
        SinClaveFiscalButtonService.navegarWeb(url);
    }

    @When("the user click on Sin Clave Fiscal button")
    public void theUserClickOnSinClaveFiscalButton() {
        SinClaveFiscalButtonService.goSinClaveFiscalButton();
    }
}