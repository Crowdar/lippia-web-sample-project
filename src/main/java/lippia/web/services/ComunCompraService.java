package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ComunCompraConstants;

public class ComunCompraService extends ActionManager {
    public static void menuTienda(){
        click(ComunCompraConstants.TIENDA);
    }
}
