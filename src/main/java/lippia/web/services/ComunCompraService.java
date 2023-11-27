package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.ComunCompraConstants;
import lippia.web.constants.FormularioConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ComunCompraService extends ActionManager {
    public static void menuTienda(){
        click(ComunCompraConstants.TIENDA);
    }
    public static void menuItem() {
        click(ComunCompraConstants.CARRITO);
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
    public static void validacionFomulario(){
        String subTotal = getText(FormularioConstants.SUBTOTAL_FORMULARIO);
        String total = getText(FormularioConstants.TOTAL_FORMULARIO);

        SoftAssert assertSoft = new SoftAssert();
        assertSoft.assertTrue(isPresent(ComunCompraConstants.DATOS_DE_FACTURACION));
        assertSoft.assertTrue(isPresent(ComunCompraConstants.INFORMACION_ADICIONAL));
        assertSoft.assertTrue(isPresent(ComunCompraConstants.ORDEN));
        assertSoft.assertTrue(isPresent(ComunCompraConstants.FORMAS_DE_PAGO));
        assertSoft.assertTrue(subTotal.contains("₹500.00") && total.contains("₹510.00"));
        assertSoft.assertAll();
    }
    public static void datos(String nombre, String apellido, String empresa, String email, String telefono, String pais, String direccion, String dpto, String ciudad, String provincia, String cp, String nota) {
        setInput(ComunCompraConstants.NOMBRE, nombre);
        setInput(ComunCompraConstants.APELLIDO, apellido);
        setInput(ComunCompraConstants.EMPRESA, empresa);
        setInput(ComunCompraConstants.EMAIL, email);
        setInput(ComunCompraConstants.TELEFONO, telefono);
        setInput(ComunCompraConstants.PAIS, pais);
        click(ComunCompraConstants.SELECIONAR_PAIS);
        setInput(ComunCompraConstants.DIRECCION, direccion);
        setInput(ComunCompraConstants.DPTO, dpto);
        setInput(ComunCompraConstants.CIUDAD, ciudad);
        setInput(ComunCompraConstants.PROVINCIA, provincia);
        click(ComunCompraConstants.SELECIONAR_PROVINCIA);
        setInput(ComunCompraConstants.CP, cp);
        setInput(ComunCompraConstants.NOTA, nota);
        AyudasServices.tiempo(2000);
        AyudasServices.scroll(1000);
        SoftAssert assertSoft = new SoftAssert();
        assertSoft.assertTrue(isPresent(ComunCompraConstants.FORMAS_DE_PAGO_TRANSFERENCIA));
        assertSoft.assertTrue(isPresent(ComunCompraConstants.FORMAS_DE_PAGO_CHEQUE));
        assertSoft.assertTrue(isPresent(ComunCompraConstants.FORMAS_DE_PAGO_CONTRAREEMBOLSO));
        assertSoft.assertTrue(isPresent(ComunCompraConstants.FORMAS_DE_PAGO_PAYPAL));
        assertSoft.assertAll();
    }
    public static void confirmacion() {
        WebElement seleccionar = getElement(ComunCompraConstants.CONFIRMACION);
        new Actions(DriverManager.getDriverInstance()).moveToElement(seleccionar).click().build().perform();
        click(ComunCompraConstants.ATRIBUTOID_BOTON);
        AyudasServices.tiempo(2000);
    }
    public static void detalleCompra() {
        String mensajeConfirmacion = getText(ComunCompraConstants.MENSAJE);
        String formadePago = getText(ComunCompraConstants.PAGO);
        String total = getText(ComunCompraConstants.TOTAL_DETALLE);
        String producto = getText(ComunCompraConstants.PRODUCTO);

        SoftAssert assertSoft = new SoftAssert();
        assertSoft.assertTrue(mensajeConfirmacion.contains("Thank you. Your order has been received."));
        assertSoft.assertTrue(formadePago.contains("Direct Bank Transfer"));
        assertSoft.assertTrue(total.contains("₹525.00"));
        assertSoft.assertTrue(producto.contains("Selenium Ruby"));
        assertSoft.assertAll();
    }
}
