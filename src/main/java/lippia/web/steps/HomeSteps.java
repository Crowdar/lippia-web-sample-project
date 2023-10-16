package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.EventManager;
import lippia.web.services.HomeService;
import lippia.web.services.MyAccountService;
import lippia.web.services.ShopService;

public class HomeSteps extends PageSteps {

    @Then("The client see (.*) Sliders only")
    public void theClientSeeThreeSlidersOnly(String numSlider) throws InterruptedException {
        HomeService.VerifierSlider(numSlider);
    }

    @And("The client click on first arrival")
    public void theClientClickOnFirstArrival() throws InterruptedException {
        HomeService.clickFirstArrival();
    }

    @And("The client clicks on the first item in the product list")
    public void theClientClicksOnTheFirstItemInTheProductList() {
        ShopService.clickFirtItem();
    }


    @Then("The client is redirected to the page {}")
    public void theClientIsRedirectedToThePage(String url) {
        EventManager.verifyUrl(url);
    }

    @And("The client click on dropdown")
    public void theClientClickOnDropdown() {
        ShopService.clickDropdwon();
    }

    @And("The cliente clicks on option {}")
    public void theClienteClicksOnOptionNumber(String option) {
        ShopService.selectDropDownOption(option);
    }

}
