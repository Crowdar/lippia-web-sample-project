package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.HomeConstants;
import lippia.web.services.HomeService;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps extends PageSteps {

    @Given("^The client is on Home Page$")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();}

    @Given("^The client is on Shop Page$")
    public void shop() {SuperiorBarNavigationBarService.navegarWeb();}

    @When( "The client click on Shop menu" )
    public void theClientClickOnShop() {
        SuperiorBarNavigationBarService.tapMenu();
    }

    @And( "The client click on Home menu")
    public void theClientClickOnMenu() throws InterruptedException{
        ShopService.clickMenuHome();
    }

    @Then( "The client see Filter By Price" )
    public void theClientSee(  ) {
        ShopService.verifyPage();
    }
}
