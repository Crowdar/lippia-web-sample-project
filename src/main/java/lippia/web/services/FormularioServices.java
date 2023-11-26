package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.FormularioConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FormularioServices extends ActionManager {
    public static void validacionFomulario(){
        String subTotal = getText(FormularioConstants.SUBTOTAL);
        String total = getText(FormularioConstants.TOTAL);

        SoftAssert assertSoft = new SoftAssert();
        assertSoft.assertTrue(isPresent(FormularioConstants.DATOS_DE_FACTURACION));
        assertSoft.assertTrue(isPresent(FormularioConstants.INFORMACION_ADICIONAL));
        assertSoft.assertTrue(isPresent(FormularioConstants.ORDEN));
        assertSoft.assertTrue(isPresent(FormularioConstants.FORMAS_DE_PAGO));
        assertSoft.assertTrue(subTotal.contains("₹500.00") && total.contains("₹510.00"));
        assertSoft.assertAll();
    }

    public static void descuento() {
        tiempo(1000);
        WebElement descuento = getElement(FormularioConstants.LINK_CUPON);
        new Actions(DriverManager.getDriverInstance()).moveToElement(descuento).click().build().perform();

        tiempo(3000);
        Assert.assertTrue(isVisible(FormularioConstants.APLICAR_CUPON,FormularioConstants.INPUT_CUPON));
    }

    public static void tiempo(int espera) {
        try {
            Thread.sleep(espera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




