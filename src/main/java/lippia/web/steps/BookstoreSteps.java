package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.BookstoreConstants;
import lippia.web.listener.CerrarPublicidad;
import lippia.web.services.BookstoreHomeService;
import lippia.web.services.BookstoreMyAccountService;

public class BookstoreSteps extends PageSteps {

    @Given("^The client is on bookstore page$")
    public void home() {
        BookstoreHomeService.webNavigation();
        BookstoreHomeService.homePageValidation();
    }

    @When("^The client clicks on (.*) on the menu bar$")
    public void theClientClicksOnShopOnTheMenuBar(String boton) {
        BookstoreHomeService.navbarButtonClick(boton);
    }

    @Then("^Verifies the Home Page has (.*) arrivals")
    public void verifiesTheHomePageHasArrivals(int cantidad) {
    BookstoreHomeService.arrivalsValidation(cantidad);
    }

    @And("The client scrolls down on the home page")
    public void theClientScrollsDownOnTheHomePage() {
    BookstoreHomeService.scrolluntil();
    }

    @Then("^Verifies the Home Page has (.*) sliders")
    public void verifiesTheHomePageHasThreeSliders(int cantidad) {
        BookstoreHomeService.carouselImgValidation(cantidad);
    }

    @And("The client clicks on the first arrival image")
    public void theClientClicksOnTheFirstArrivalImage() {
        BookstoreHomeService.clickeableImgValidation();
    }

    @Then("Verifies that Add To Basket Button is visible to the client")
    public void verifiesThatAddToBasketButtonIsVisibleToTheClient() {
        BookstoreHomeService.addButtonValidation();
    }

    @And("^The client enters (.*) in username textbox")
    public void theClientEntersTestuserAutomationYopmailComInUsernameTextbox(String email) {
        BookstoreHomeService.enterUser(email);
    }

    @And("^The client enters (.*) in Password textbox")
    public void theClientEntersTestinmgInPasswordTextbox(String pass) {
        BookstoreHomeService.enterPass(pass);
    }

    @And("The client clicks on login button")
    public void theClientClicksOnLoginButton() {
        BookstoreHomeService.loginButtonClick();
    }

    @And("^Verifies that the client navigates to (.*) page")
    public void verifiesThatTheClientNavigatesToPage(String url) {
        BookstoreHomeService.urlValidation(url);
    }

    @Then("^Displays a message error with the text (.*)")
    public void displaysAMessageErrorWithTheText(String errormsg) {
        BookstoreHomeService.errorValidation(errormsg);
    }

    @And("Displays the login form for retrying login")
    public void displaysTheLoginFormForRetryingLogin() {
        BookstoreHomeService.loginFormValidation();
    }
}

