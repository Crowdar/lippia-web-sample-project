package com.crowdar.examples.steps;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps extends PageSteps {

    private SearchPage searchPage;

    public SearchSteps(SharedDriver driver){
        super(driver);
        searchPage = new SearchPage(driver);
    }

    @Given("The client is in google page")
    public void home(){
        searchPage.goToInit();
    }

    @When("The client search for word (.*)")
    public void search(String criteria){
        searchPage.enterSearchCriteria(criteria);
		searchPage.clickSearchButton();

    }

    @Then("The client verify that results are shown properly")
    public void verfication(){
	
    }
}
