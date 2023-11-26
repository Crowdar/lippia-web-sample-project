package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.ComunCompraConstants;
import lippia.web.constants.HomePageConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class ShopService extends ActionManager {
    public static void libro() {
        AyudasServices.scroll(1000);
        click(ShopConstants.PRODUCTO);
        AyudasServices.tiempo(3000);
    }
    public static void carrito() {
        String verificacionCarrito = getText(ComunCompraConstants.CARRITO);
        Assert.assertTrue(verificacionCarrito.contains("₹500.00"));
    }
    public static void impuestos(String pais, int impuesto) {
        AyudasServices.scroll(1000);
        setInput(ComunCompraConstants.PAIS, pais);
        if (pais.equals("India")){
            click(ShopConstants.PAIS_INDIA);
        }else {
        }

        AyudasServices.tiempo(7000);
    }
}
