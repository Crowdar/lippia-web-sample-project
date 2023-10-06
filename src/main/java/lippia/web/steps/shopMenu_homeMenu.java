package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeMenuService;
import lippia.web.services.ShopMenuService;


public class shopMenu_homeMenu extends PageSteps {


    @Given("The user enter the URL {string}")
    public void home(String url) {
        ShopMenuService.navegarWeb(url);
    }

    @When("the user click on Shop menu button")
    public void theUserClickOnShopMenuButton() {

        ShopMenuService.goShop();
    }
    @When("the user click on Home menu button")
    public void theUserClickOnHomeMenuButton() {
        HomeMenuService.goHome();
    }



    @Then("the user verifies that the Home page has three Sliders only")
    public void theUserVerifiesThatTheHomePageHasThreeSlidersOnly() {


    }


}