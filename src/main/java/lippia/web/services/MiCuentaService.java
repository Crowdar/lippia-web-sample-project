package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MiCuentaConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class MiCuentaService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void ingresarDashboard() {
        click(MiCuentaConstants.MY_ACCOUNT);
    }

    public static void verificarDashboard() {
        Assert.assertTrue(ActionManager.waitPresence(MiCuentaConstants.VERIFICAR_DASHBOARD).isDisplayed());
    }

    public static void ingresarOrdenes() {
        click(MiCuentaConstants.ORDENES);
    }

    public static void verificarOrdenes() {
        Assert.assertTrue(ActionManager.waitPresence(MiCuentaConstants.VERIFICAR_ORDENES).isDisplayed());
    }

    public static void Logout() {
        click(MiCuentaConstants.LOGOUT);
    }

    public static void verificarLogout() {
        Assert.assertTrue(ActionManager.waitPresence(MiCuentaConstants.VERIFICAR_LOGOUT).isDisplayed());
    }

}
