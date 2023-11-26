package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ProductoConstants;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ProductoService extends ActionManager {

    public static void Item() {
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(isPresent(ProductoConstants.IMAGEN));
        softAssert.assertTrue(isPresent(ProductoConstants.DETALLE_LIBRO));
        softAssert.assertTrue(isPresent(ProductoConstants.DESCRIPCION_LIBRO));
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

    public static void menuItem() {
        click(ProductoConstants.ITEM);
    }
}
