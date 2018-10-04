package com.crowdar.examples.testng;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class StepDefinitions extends PageSteps {

    public StepDefinitions(SharedDriver driver) {
        super(driver);
    }

     @Given("^I am on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
    public void i_am_on_the_page_on_URL(String arg1, String arg2) throws Throwable {
       getDriver().get("http://www.google.com");
       Thread.sleep(10000l);
    }

    @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
       System.out.println("step2---------------------");
    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        System.out.println("step3---------------------"); 
    }

    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String arg1) throws Throwable {
       System.out.println("step4---------------------");
    }

    @Then("^I should see the \"([^\"]*)\" button$")
    public void i_should_see_the_button(String arg1) throws Throwable {
        System.out.println("step5---------------------");
        Assert.fail();
    }
}
