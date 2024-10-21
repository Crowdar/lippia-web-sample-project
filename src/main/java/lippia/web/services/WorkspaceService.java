package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LoginPageConstants;
import lippia.web.constants.WorkspaceConstants;

import static lippia.web.constants.WorkspaceConstants.*;
import static lippia.web.services.LandingPageService.clickOnLogIn;
import static lippia.web.services.LandingPageService.navegarWeb;
import static lippia.web.services.LoginPageService.*;
import static lippia.web.services.LoginPageService.clickOnLogInButton;

public class WorkspaceService extends ActionManager {

    public static void realizarLogin(String email, String pass) {
        navegarWeb();
        clickOnLogIn();
        clikOnManually();
        setEmail(email);
        setPassword(pass);
        clickOnLogInButton();
}

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
        int numeroAleatorio = (int) (Math.random() * 100);
        String nameRandom = name + numeroAleatorio;
        WebActionManager.setInput(WorkspaceConstants.INPUT_WORKSPACE_NAME, nameRandom);

    }
    public static void inputEditWorkspace(String name) {
        WebActionManager.setInput(INPUT_WORKSPACE_NAME_EDIT, name);


    }
    public static void createButton() {
        WebActionManager.waitClickable(WorkspaceConstants.BUTTON_CREATE).click();
    }

    public static void clickSettings(){
        WebActionManager.waitClickable(WorkspaceConstants.BUTTON_SETTING).click();
    }

    public static void validateWorkspaceCreated(String name){
        WebActionManager.waitVisibility(NAME_WORKSPACE, name);
        Assert.assertTrue(isPresent(NAME_WORKSPACE, name));
    }

    public static void validateWorkspaceName(String expectedName) {
        String newName = WebActionManager.getText(INPUT_WORKSPACE_NAME_EDIT);
        System.out.println(newName);
        WebActionManager.waitVisibility(WorkspaceConstants.NAME_WORKSPACE_EDITED);
        Assert.assertEquals(NAME_WORKSPACE_EDITED, expectedName, newName);
    }
}