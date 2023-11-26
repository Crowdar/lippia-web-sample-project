package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

public class LoginService extends ActionManager {
    public static void verificarError(String error){
        Assert.assertTrue(ActionManager.waitPresence(LoginConstants.VERIFICACION_ERROR,error).isDisplayed());
    }
    public static void back() {
        DriverManager.getDriverInstance().getWrappedDriver().navigate().back();
    }
}
