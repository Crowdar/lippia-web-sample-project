package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.GoogleHomePage;
import com.crowdar.examples.pages.GoogleSearchResultPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class GoogleSteps extends PageSteps {

    @Given("The client is in google page")
    public void home() {
        Injector._page(GoogleHomePage.class).go();
    }

    @When("The client search for word (.*)")
    public void search(String criteria) {
        Injector._page(GoogleHomePage.class).enterSearchCriteria(criteria);
        Injector._page(GoogleHomePage.class).clickSearchButton();

    }

    @Then("The client verify that results are shown properly")
    public void statVerfication() {
        Assert.assertTrue(!Injector._page(GoogleSearchResultPage.class).getStats().isEmpty());

    }
}
