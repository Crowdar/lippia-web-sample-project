package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ComunCompraConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ShopService extends ActionManager {
    public static void menuTienda(){
        click(ComunCompraConstants.TIENDA);
        AyudasServices.emergentes();
        click(ComunCompraConstants.TIENDA);
    }
    public static void libro() {
        AyudasServices.scroll(1000);
        click(ShopConstants.PRODUCTO);
        AyudasServices.tiempo(3000);
    }
    public static void carrito() {
        String verificacionCarrito = getText(ComunCompraConstants.CARRITO);
        Assert.assertTrue(verificacionCarrito.contains("₹500.00"));
    }
    public static void impuestos(String pais, double impuesto) {
        setInput(ComunCompraConstants.PAIS, pais);
        click(ShopConstants.PAIS_INDIA);
        double subtotalValor = llamarSubtotal();
        double impuestoValor = llamarImpuesto();
        double verificacionImpuesto = (impuestoValor/subtotalValor)*100;
        AyudasServices.scroll(2000);
        AyudasServices.tiempo(2000);
        Assert.assertEquals(verificacionImpuesto, impuesto);
    }
    public static double llamarSubtotal(){
        WebElement subtotal = getElement(ShopConstants.SIN_IMPUESTO);
        return Double.parseDouble(subtotal.getText().substring(1));
    }
    public static double llamarImpuesto(){
        WebElement total = getElement(ShopConstants.IMPUESTO);
        return Double.parseDouble(total.getText().substring(1));
    }
}
