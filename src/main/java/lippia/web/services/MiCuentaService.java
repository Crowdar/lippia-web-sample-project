package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MiCuentaConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class MiCuentaService extends ActionManager {

    public static void detalles() {
        click(MiCuentaConstants.DETALLES);
    }

    public static void verificacionDetalles() {
        Assert.assertTrue(ActionManager.waitPresence(MiCuentaConstants.VERIFICAR_DETALLES).isDisplayed());
    }


    public static void logout() {
        click(MiCuentaConstants.LOGOUT);
    }

    public static void verificarLogout() {
        Assert.assertTrue(ActionManager.waitPresence(MiCuentaConstants.VERIFICAR_LOGOUT).isDisplayed());
    }

}
