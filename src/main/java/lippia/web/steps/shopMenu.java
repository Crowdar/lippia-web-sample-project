package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopMenuService;


public class shopMenu extends PageSteps {


    @Given("The user enter the URL {string}")
    public void theUserEnterTheURL(String arg0) {
    }

    @When("the user click on Shop menu button")
    public void theUserClickOnShopMenuButton() {
        ShopMenuService.goShop();
    }
    @When("the user click on Home menu button")
    public void theUserClickOnHomeMenuButton() {
        ShopMenuService.goHome();
    }



    @Then("the user verifies that the Home page has three Sliders only")
    public void theUserVerifiesThatTheHomePageHasThreeSlidersOnly() {
    }


}