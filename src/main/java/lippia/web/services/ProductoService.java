package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.ProductoConstants;
import org.testng.Assert;

public class ProductoService extends ActionManager {

    public static void menuItem() {
        String url = DriverManager.getDriverInstance().getCurrentUrl();
        boolean  seleniumruby = url.matches("https://practice.automationtesting.in/product/selenium-ruby/");
        Assert.assertTrue(seleniumruby);
    }

    public static void agregar() {
        click(ProductoConstants.AGREGAR);

        String precio1 = getText(ProductoConstants.PRECIO_PRODUCTO);
        String precio2 = getText(ProductoConstants.PRECIO_CARRITO);
        Assert.assertTrue(precio1.contains("₹500.00") && precio2.contains("₹500.00"));

        String item = getText(ProductoConstants.ITEM);
        String [] transformarArray = item.split(" ");
        int cantidad = Integer.parseInt(transformarArray[0]);
        Assert.assertEquals(1,cantidad);
    }
}
