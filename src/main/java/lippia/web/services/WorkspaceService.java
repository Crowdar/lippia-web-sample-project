package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.WorkspaceConstants;

import static lippia.web.constants.WorkspaceConstants.*;

public class WorkspaceService extends ActionManager {

     public static void worskpaceDropdown(){

         WebActionManager.click(WorkspaceConstants.DROPDOWN_PROFILE);
 }

     public static void worskpaceManage() {

         WebActionManager.click(WorkspaceConstants.WORKSPACE_MANAGER);
    }

    public static void clickOncreateNew() {
        WebActionManager.waitClickable(WorkspaceConstants.BUTTON_NEW_WORSKPACES).click();

    }
    public static void inputWorkspace(String name) {
        WebActionManager.waitClickable(WorkspaceConstants.INPUT_WORKSPACE_NAME);
        WebActionManager.setInput(WorkspaceConstants.INPUT_WORKSPACE_NAME, name);

    }
    public static void inputEditWorkspace(String name) {
        CommonSteps.deleteInfoInput(INPUT_WORKSPACE_NAME_EDIT, 50);
        WebActionManager.setInput(INPUT_WORKSPACE_NAME_EDIT, name);

    }
    public static void createButton() throws InterruptedException {
         WebActionManager.waitVisibility(BUTTON_CREATE);
         WebActionManager.click(WorkspaceConstants.BUTTON_CREATE);
            Thread.sleep(1000);
    }

    public static void clickSettings(){

         WebActionManager.waitClickable(WorkspaceConstants.BUTTON_SETTING).click();
    }

    public static void validateWorkspaceCreated(String name){
        WebActionManager.waitVisibility(NAME_WORKSPACE, name);
        WebActionManager.getText(WorkspaceConstants.NAME_WORKSPACE, name);
    }

    public static void validateWorkspaceName(String newName) {

        // Obtiene el nombre actual del workspace desde la interfaz
        String actualName = WebActionManager.getAttribute(INPUT_WORKSPACE_NAME_EDIT, "value");
        // Compara el nombre actual con el nuevo nombre esperado
        Assert.assertEquals("El nombre del workspace no coincide", newName, actualName);

    }
}