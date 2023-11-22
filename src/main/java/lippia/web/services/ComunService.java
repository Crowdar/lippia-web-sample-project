package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MainLoginConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ComunService extends ActionManager{

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void loginPage(){
        click(MainLoginConstants.MY_ACCOUNT);
    }

    public static void ingresarLogin(String login, String password) {
        setInput(MainLoginConstants.LOGIN, login);
        setInput(MainLoginConstants.PASSWORD_LOG, password);
        click(MainLoginConstants.BOTON_LOGIN);
    }
}
