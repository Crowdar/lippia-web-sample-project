package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.TimeEntryPageService;


public class TimeEntrySteps extends PageSteps {
    @When("selects project '(.*)' from the time tracker")
    public void selectProjectTraker(String proyecto)
    {
        TimeEntryPageService.clickOnProject(proyecto);
    }

    @And("enter start time '(.*)'")
    public void setStartDate(String time)
    {
        TimeEntryPageService.deleteInfoInputStart(time);
        TimeEntryPageService.setDateStartManually(time);

    }

    @And("enter end time '(.*)'")
    public void setEndDate(String time)
    {
        TimeEntryPageService.deleteInfoInputEnd(time);
        TimeEntryPageService.setDateEndManually(time);
    }

    @And("enter a description for the hours to add '(.*)'")
    public void setDescription(String description)
    {

        TimeEntryPageService.setDescription(description);
    }
    @And("enter date '(.*)'")
    public void setDate(String time)
    {
        TimeEntryPageService.deleteInfoInputDate(time);
        TimeEntryPageService.setDate(time);
    }

    @And("selects tag '(.*)'")
    public void addNewTag(String tags)
    {
        TimeEntryPageService.clickOnNewTag(tags);
    }

    @And("press the button 'Add'")
    public void addTimeTracker() {

        TimeEntryPageService.clickOnButtonAdd();
    }

    @Then("an alert is displayed '(.*)'")
    public void validateAlert(String expectedAlert) {
        TimeEntryPageService.validateAlertSucessfully(expectedAlert);

    }

    @And("the start time '(.*)', end time '(.*)', and description '(.*)' are loaded correctly")
    public void validateNewEntryDatatime(String start, String end, String description) {
        TimeEntryPageService.validateDataNewTimeEntry(start,end,description);
    }

    @When("select a previously loaded work hour")
    public void verifyTimeEntryExists() {

        TimeEntryPageService.verifyExistTimeTracking();
    }

    @And("enter new start time '(.*)'")
    public void setNewStartDate(String time)
    {
        TimeEntryPageService.setDateStartManuallyNew(time);

    }
    @And("enter new end time '(.*)'")
    public void setNewEndDate(String time)
    {
        TimeEntryPageService.setDateEndManuallyNew(time);

    }

    @And("enter a new description for the hours to add '(.*)'")
    public void setNewDescription(String description)
    {
        TimeEntryPageService.clickOnManuallyMode();
        TimeEntryPageService.setDescriptionNew(description);
    }


    @And("change to non-billable")
    public void setNonBillabelOption() {

        TimeEntryPageService.setBillableOption();
    }

    @And("select a new project '(.*)' from the time tracker")
    public void selectNewProject(String proyecto)
    {
        TimeEntryPageService.clickOnNewProject(proyecto);
    }

    @And("press 'Timer Mode' button")
    public void clickOnTimerIcon()
    {

        TimeEntryPageService.clickOnTimerMode();
    }
    @And("press the button 'Start'")
    public void startCounterHours()
    {

        TimeEntryPageService.clickOnStartButton();
    }
    @And("select 'Discard' option")
    public void discardHours() throws InterruptedException {
        TimeEntryPageService.clickOnDiscardButton();

    }

    @When("select the options menu of a loaded hour")
    public void clickMenuOptions() {
        TimeEntryPageService.clickOnMenu();

    }
    @And("select the delete option")
    public void selectDeleteOption()
    {
        TimeEntryPageService.clickOnDelete();

    }

}
