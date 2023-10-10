package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.IngresarLoginConstansts;

public class IngresarLoginService extends ActionManager{
    public static void ingresarLogin(String login, String password) {
        click(IngresarLoginConstansts.MY_ACCOUNT);
        setInput(IngresarLoginConstansts.LOGIN, login);
        setInput(IngresarLoginConstansts.PASSWORD, password);
        click(IngresarLoginConstansts.BOTON_LOGIN);
    }
}
