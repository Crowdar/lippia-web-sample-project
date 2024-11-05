package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.TimeEntryPageConstants;

import java.sql.Time;

import static lippia.web.constants.TimeEntryPageConstants.*;

public class TimeEntryPageService extends ActionManager {


    public static void clickOnProject(String proyecto) {
        WebActionManager.click(TimeEntryPageConstants.MANUAL_MODE_BUTTON);
        String projectButtonLocator = String.format(TimeEntryPageConstants.DROPDOWN_PROJECTS, proyecto);
        WebActionManager.click(TimeEntryPageConstants.BUTTON_PROJECTS);
        WebActionManager.click(projectButtonLocator);
    }
    public static void deleteInfoInputStart(String time){
        CommonSteps.deleteInfoInput(TimeEntryPageConstants.START_DATE_INPUT, time.length());
    }
    public static void deleteInfoInputEnd(String time){
        CommonSteps.deleteInfoInput(TimeEntryPageConstants.END_DATE_INPUT, time.length());
    }
    public static void deleteInfoInputDate(String time){
        CommonSteps.deleteInfoInput(TimeEntryPageConstants.DATE_INPUT, time.length());
    }
    public static void setDateStartManually(String time) {
        WebActionManager.setInput(TimeEntryPageConstants.START_DATE_INPUT, time);
    }
    public static void setDateEndManually(String time) {
         WebActionManager.setInput(TimeEntryPageConstants.END_DATE_INPUT, time);
         WebActionManager.click(TimeEntryPageConstants.LAYOUT);

    }
    public static void setDescription(String description) {
        WebActionManager.setInput(TimeEntryPageConstants.DESCRIPTION_INPUT,description);
    }
    public static void setDate(String date) {

        WebActionManager.setInput(TimeEntryPageConstants.DATE_INPUT,date);
    }
    public static void clickOnButtonAdd() {

        WebActionManager.click(TimeEntryPageConstants.ADD_BUTTON);
    }

    public static void validateAlertSucessfully(String expectedAlert) {

        WebActionManager.waitVisibility(TimeEntryPageConstants.TIME_ENTRY_CREATED);

        // Obtener el texto de la alerta
        String actualAlertText = WebActionManager.getText(TimeEntryPageConstants.TIME_ENTRY_CREATED);

        // Comparar el texto actual con el texto esperado
        Assert.assertEquals("El texto de la alerta no coincide.", expectedAlert, actualAlertText);

    }

    public static void clickOnTimerMode() {
        WebActionManager.waitVisibility(TimeEntryPageConstants.TIMER_MODE_BUTTON);
        WebActionManager.click(TimeEntryPageConstants.TIMER_MODE_BUTTON);
    }
    public static void clickOnManuallyMode() {
        WebActionManager.waitVisibility(TimeEntryPageConstants.MANUAL_MODE_BUTTON);
        WebActionManager.click(TimeEntryPageConstants.MANUAL_MODE_BUTTON);
    }
    public static void clickOnStartButton() {
        WebActionManager.waitVisibility(TimeEntryPageConstants.START_BUTTON);
        WebActionManager.click(TimeEntryPageConstants.START_BUTTON);
    }
    public static void clickOnDiscardButton() throws InterruptedException {
        WebActionManager.click(TimeEntryPageConstants.TIMER_OPTIONS_BUTTON);
        Thread.sleep(1000);
        WebActionManager.click(TimeEntryPageConstants.DISCARD_BUTTON);
        WebActionManager.waitVisibility(TimeEntryPageConstants.DISCARD_CONFIRMATION_BUTTON);
        WebActionManager.click(TimeEntryPageConstants.DISCARD_CONFIRMATION_BUTTON);

    }
    public static void validateDataNewTimeEntry(String start, String end, String description) {
        // Validar horario de inicio
        String actualStart = WebActionManager.getAttribute(START_TIME_INPUT_NEW,"value");
        Assert.assertEquals("El horario de inicio no coincide.", start, actualStart);

        // Validar horario de fin
       String actualEnd =  WebActionManager.getAttribute(END_TIME_INPUT_NEW,"value");
       Assert.assertEquals("El horario de fin no coincide.", end, actualEnd);

        // Validar descripción
        String actualDescription = WebActionManager.getAttribute(NEW_DESCRIPTION_INPUT,"value");
        Assert.assertEquals("La descripción no coincide.", description, actualDescription);
    }
    public static void setDescriptionNew(String description) {
        CommonSteps.deleteInfoInput(TimeEntryPageConstants.NEW_DESCRIPTION_INPUT, 50);
        WebActionManager.setInput(TimeEntryPageConstants.NEW_DESCRIPTION_INPUT,description);
        WebActionManager.click(TimeEntryPageConstants.LAYOUT);
    }

    public static void setDateStartManuallyNew(String time) {
        CommonSteps.deleteInfoInput(START_TIME_INPUT_NEW, time.length());
        WebActionManager.setInput(START_TIME_INPUT_NEW, time);
    }

    public static void setDateEndManuallyNew(String time) {
        CommonSteps.deleteInfoInput(END_TIME_INPUT_NEW, time.length());
        WebActionManager.setInput(END_TIME_INPUT_NEW, time);
        WebActionManager.click(TimeEntryPageConstants.LAYOUT);
    }

    public static void setBillableOption() {
        WebActionManager.waitVisibility(TimeEntryPageConstants.BILLABLE_BUTTON);
        WebActionManager.click(TimeEntryPageConstants.BILLABLE_BUTTON);
    }
    public static void clickOnNewProject(String proyecto) {
        WebActionManager.click(TimeEntryPageConstants.MANUAL_MODE_BUTTON);
        String projectButtonLocator = String.format(TimeEntryPageConstants.DROPDOWN_PROJECTS, proyecto);
        WebActionManager.click(TimeEntryPageConstants.BUTTON_PROJECTS_NEW);
        WebActionManager.click(projectButtonLocator);
    }

    public static void clickOnNewTag(String tags) {
        WebActionManager.click(TimeEntryPageConstants.ADD_TAGS, tags);
        String tagButtonLocator = String.format(TimeEntryPageConstants.CHECKBOXS_TAGS, tags);
        WebActionManager.click(tagButtonLocator);
        WebActionManager.click(TimeEntryPageConstants.LAYOUT);
    }
    public static void clickOnMenu() {

        WebActionManager.click(TimeEntryPageConstants.MENU_OPTION);
    }
    public static void clickOnDelete() {
        WebActionManager.click(TimeEntryPageConstants.DELETE_BUTTON_OPTION);
        WebActionManager.waitVisibility(TimeEntryPageConstants.DELETE_BUTTON_CONFIRM);
        WebActionManager.click(TimeEntryPageConstants.DELETE_BUTTON_CONFIRM);
    }
    public static void verifyExistTimeTracking() {
        WebActionManager.isPresent(TimeEntryPageConstants.NEW_DESCRIPTION_INPUT);
    }
}