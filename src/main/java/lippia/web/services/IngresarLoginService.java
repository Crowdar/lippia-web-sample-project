package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MainLoginConstants;

public class IngresarLoginService extends ActionManager{
    public static void ingresarLogin(String login, String password) {
        click(MainLoginConstants.MY_ACCOUNT);
        setInput(MainLoginConstants.LOGIN, login);
        setInput(MainLoginConstants.PASSWORD_LOG, password);
        click(MainLoginConstants.BOTON_LOGIN);
    }
}
