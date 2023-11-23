package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ComunLoginConstants;
import lippia.web.constants.RegistroConstants;
import org.testng.asserts.SoftAssert;


public class ComunLoginService extends ActionManager{
    public static void loginPage(){
        click(ComunLoginConstants.MY_ACCOUNT);
    }

    public static void ingresarLogin(String login, String password) {
        setInput(ComunLoginConstants.LOGIN, login);
        setInput(ComunLoginConstants.PASSWORD_LOG, password);
        click(ComunLoginConstants.BOTON_LOGIN);
    }

    public static void verificacionLoginPage(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(isPresent(RegistroConstants.BOTON_REGISTRO));
        softAssert.assertTrue(isPresent(ComunLoginConstants.BOTON_LOGIN));
        softAssert.assertAll();
    }
}
