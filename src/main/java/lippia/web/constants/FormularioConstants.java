package lippia.web.constants;

public class FormularioConstants {
    public static  final String DATOS_DE_FACTURACION = "xpath://div[@class='woocommerce-billing-fields']";
    public static  final String INFORMACION_ADICIONAL = "xpath://div[@class='woocommerce-shipping-fields']";
    public static  final String ORDEN = "xpath://table[@class='shop_table woocommerce-checkout-review-order-table']";
    public static  final String FORMAS_DE_PAGO = "id:payment";
    public static  final String SUBTOTAL = "xpath://tr[@class='cart-subtotal']//span[@class='woocommerce-Price-amount amount']";
    public static  final String TOTAL = "xpath://*[@class='order-total']//span[@class='woocommerce-Price-amount amount']";
    public static  final String LINK_CUPON = "xpath://a[.='Click here to enter your code']";
    public static  final String APLICAR_CUPON = "xpath://input[@name='apply_coupon']";
    public static  final String INPUT_CUPON = "xpath://input[@id='coupon_code']";
}
