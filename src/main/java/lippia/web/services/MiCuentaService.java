package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MiCuentaConstants;
import org.testng.Assert;

public class MiCuentaService extends ActionManager {
    public static void detalles() {
        click(MiCuentaConstants.DETALLES);
    }

    public static void verificacionDetalles() {
        Assert.assertTrue(ActionManager.waitPresence(MiCuentaConstants.VERIFICAR_DETALLES).isDisplayed());
    }

    public static void signOut() {
        click(MiCuentaConstants.SIGNOUT);
    }
}
