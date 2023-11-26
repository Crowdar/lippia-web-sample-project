package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ComunCompraConstants;
import org.testng.Assert;

public class ComunCompraService extends ActionManager {
    public static void menuTienda(){
        click(ComunCompraConstants.TIENDA);
    }
    public static void verificacionValores(){
        String Subtotal = getAttribute(ComunCompraConstants.SUBTOTAL, "innerText").substring(1,4);
        String total = getAttribute(ComunCompraConstants.TOTAL, "innerText").substring(1,4);
        int SubTotal = Integer.parseInt(Subtotal);
        int Total = Integer.parseInt(total);
        Assert.assertTrue(SubTotal < Total);
        Assert.assertTrue(isVisible(ComunCompraConstants.LIBRO));
    }
    public static void checkout(){
        click(ComunCompraConstants.CHECKOUT);
    }
}
