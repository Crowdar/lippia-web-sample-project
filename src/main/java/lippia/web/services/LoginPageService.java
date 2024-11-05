package lippia.web.services;


import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LoginPageConstants;


public class LoginPageService extends ActionManager {

    public static void clickOnManually() {

        WebActionManager.click(LoginPageConstants.BUTTON_LOG_IN_MANUALLY);
    }
    public static void setEmail(String email) {

        WebActionManager.setInput(LoginPageConstants.EMAIL_INPUT, email);
    }
    public static void setPassword(String pass) {

        WebActionManager.setInput(LoginPageConstants.PASSWORD_INPUT, pass);
    }

    public static void clickOnLogInButton() {

        WebActionManager.click(LoginPageConstants.BUTTON_LOG_IN);
    }
    public static void verifyDashboard (){
        WebActionManager.isPresent(LoginPageConstants.DASHBOARD);

    }

    public static void verifyAlertEmail(String expectedAlert) {
        String actualAlert = WebActionManager.getText(LoginPageConstants.ALERT_MESSAGE);
        Assert.assertEquals("La alerta no coincide con la esperada", expectedAlert, actualAlert);
    }
    public static void verifyAlertPassword(String expectedAlertPass) {
        String actualAlert = WebActionManager.getText(LoginPageConstants.ALERT_MESSAGE_PASSWORD);
        Assert.assertEquals("La alerta no coincide con la esperada", expectedAlertPass, actualAlert);
    }

    public static void clickOnDropdown() {

        WebActionManager.click(LoginPageConstants.DROPDOWN);
    }
    public static void clickOnLogOutButton() {

        WebActionManager.click(LoginPageConstants.BUTTON_LOG_OUT);
    }
}