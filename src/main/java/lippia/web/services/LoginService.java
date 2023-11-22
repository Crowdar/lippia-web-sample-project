package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.MainLoginConstants;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void verificarError(String error){
        Assert.assertTrue(ActionManager.waitPresence(LoginConstants.VERIFICACION_ERROR,error).isDisplayed());
    }

    public static void back() {
        DriverManager.getDriverInstance().getWrappedDriver().navigate().back();
    }

    public static void verificacionLoginPage(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(isPresent(MainLoginConstants.BOTON_REGISTRO));
        softAssert.assertTrue(isPresent(MainLoginConstants.BOTON_LOGIN));
        softAssert.assertAll();
    }
}
