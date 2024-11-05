package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.ProjectConstants;

public class ProjectService extends ActionManager {


    public static void clickButtonProject(){
        WebActionManager.waitClickable(ProjectConstants.BUTTON_PROJECTS).click();
    }
    public static void clickButtonNewProject(){
        WebActionManager.waitClickable(ProjectConstants.BUTTON_NEW_PROJECTS).click();
    }

    public static void inputProject(String name) {
        WebActionManager.waitVisibility(ProjectConstants.INPUT_PROJECT);
        WebActionManager.setInput(ProjectConstants.INPUT_PROJECT, name);
    }

    public static void validateNameProject(String name) {
        WebActionManager.waitVisibility(ProjectConstants.INPUT_PROJECT);
        WebActionManager.getText(ProjectConstants.INPUT_PROJECT, name);
    }

    public static void clickOnCreate() {
        WebActionManager.click(ProjectConstants.BUTTON_CREATE);
    }
    public static void validateAlertSucessfully(String expectedAlert) {

        WebActionManager.waitVisibility(ProjectConstants.ALERT);

        // Obtener el texto de la alerta
        String actualAlertText = WebActionManager.getText(ProjectConstants.ALERT);

        // Comparar el texto actual con el texto esperado
        Assert.assertEquals("El texto de la alerta no coincide.", expectedAlert, actualAlertText);

    }

}