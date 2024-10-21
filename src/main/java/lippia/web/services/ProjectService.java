package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.WorkspaceConstants;

import static lippia.web.constants.WorkspaceConstants.INPUT_WORKSPACE_NAME_EDIT;
import static lippia.web.services.LandingPageService.clickOnLogIn;
import static lippia.web.services.LandingPageService.navegarWeb;
import static lippia.web.services.LoginPageService.*;

public class ProjectService extends ActionManager {

    public static void realizarLogin(String email, String pass) {
        navegarWeb();
        clickOnLogIn();
        clikOnManually();
        setEmail(email);
        setPassword(pass);
        clickOnLogInButton();
}

    public static void clickbuttonProject(){
        WebActionManager.waitClickable(ProjectConstants.BUTTON_PROJECTS).click();
    }
    public static void clickbuttonNewProject(){
        WebActionManager.waitClickable(ProjectConstants.BUTTON_NEW_PROJECTS).click();
    }

    public static void inputProject(String name) {
        WebActionManager.waitVisibility(ProjectConstants.INPUT_PROJECT);
        int numeroAleatorio = (int) (Math.random() * 100);
        String nameRandom = name + numeroAleatorio;
        WebActionManager.setInput(ProjectConstants.INPUT_PROJECT, nameRandom);
        // WebActionManager.setInput(ProjectConstants.INPUT_PROJECT, name);
    }

    public static void clickOnCreate() {
        WebActionManager.click(ProjectConstants.BUTTON_CREATE);
    }

    public static void alertCreate()
    {
        WebActionManager.isVisible(ProjectConstants.ALERT);
    }

}