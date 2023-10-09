package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.DropdownConstants;
import lippia.web.services.DropdownService;
import lippia.web.services.ShopMenuService;
import org.testng.Assert;


public class shopMenu extends PageSteps {


    @Given("The user enter the URL {string}")
    public void home(String url) {

        ShopMenuService.navegarWeb(url);
    }



    @When("the user Click on Shop Menu")
    public void theUserClickOnShopMenu() {
        ShopMenuService.goShop();
    }


    @And("the user click on Sort by {} item in Default sorting dropdown")
    public void theUserClickOnSortByItemInDefaultSortingDropdown(String arg0) {
        DropdownService.clickShopDropdown(arg0);


    }

    private static final String FILTER_BY_POPULARITY = "xpath://*[@id='content']/form/select/option[2]";
    @Then("the user can view the popular products only")


    public void theUserCanViewThePopularProductsOnly() {

        Assert.assertTrue( ActionManager.waitPresence(FILTER_BY_POPULARITY).isDisplayed() );
    }
}