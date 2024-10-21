package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LandingPageConstants;
import lippia.web.constants.LoginPageConstants;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginPageService extends ActionManager {

    public static void clikOnManually() {
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

    }

    public static void verifyAlertEmail(String expectedAlert) {
        String actualAlert = WebActionManager.getText(LoginPageConstants.ALERT_MESSAGE);
        Assert.assertEquals("La alerta no coincide con la esperada", expectedAlert, actualAlert);
    }
    public static void verifyAlertPass(String expectedAlertPass) {
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