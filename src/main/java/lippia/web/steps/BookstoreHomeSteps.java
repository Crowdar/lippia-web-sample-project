package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BookstoreHomeService;

public class BookstoreHomeSteps extends PageSteps {

    @Then("^Verifies the Home Page has (.*) arrivals")
    public void verifyArrivals(int cantidad) {
        BookstoreHomeService.arrivalsValidation(cantidad);
    }

    @And("The client scrolls down on the home page")
    public void scrollHomePage() {
        BookstoreHomeService.scrolluntil();
    }

    @Then("^Verifies the Home Page has (.*) sliders")
    public void verifySliders(int cantidad) {
        BookstoreHomeService.carouselImgValidation(cantidad);
    }

    @And("The client clicks on the first arrival image")
    public void arrivalsImgClick() {
        BookstoreHomeService.clickeableImgValidation();
    }

    @Then("Verifies that Add To Basket Button is visible to the client")
    public void verifyAddToTheBasketButton() {
        BookstoreHomeService.addButtonValidation();
    }

}

