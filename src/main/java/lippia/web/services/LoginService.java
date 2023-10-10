package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void verificarResultadoExitoso(){
        Assert.assertTrue(ActionManager.waitPresence(LoginConstants.VERIFICACION_EXITOSA).isDisplayed());
    }

    public static void verificarResultadoFallido(){
        Assert.assertTrue(ActionManager.waitPresence(LoginConstants.VERIFICACION_FALLIDA).isDisplayed());
    }
}
