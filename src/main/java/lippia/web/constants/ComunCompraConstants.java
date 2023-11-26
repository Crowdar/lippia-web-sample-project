package lippia.web.constants;

public class ComunCompraConstants {
    public static final String TIENDA = "xpath://*[contains(text(),'Shop')]";
    public static final String CARRITO ="xpath://span[@class='amount']";
    public static final String SUBTOTAL ="xpath://td[@class='product-subtotal']/span[@class='woocommerce-Price-amount amount']";
    public static final String TOTAL ="xpath://strong/span[@class='woocommerce-Price-amount amount']";
    public static final String LIBRO ="xpath://td[@class='product-name']";
    public static final String CHECKOUT ="xpath://a[@class='checkout-button button alt wc-forward']";
    public static  final String DATOS_DE_FACTURACION = "xpath://div[@class='woocommerce-billing-fields']";
    public static  final String INFORMACION_ADICIONAL = "xpath://div[@class='woocommerce-shipping-fields']";
    public static  final String ORDEN = "xpath://table[@class='shop_table woocommerce-checkout-review-order-table']";
    public static  final String FORMAS_DE_PAGO = "id:payment";
    public static  final String NOMBRE = "id:billing_first_name";
    public static  final String APELLIDO = "id:billing_last_name";
    public static  final String EMPRESA = "id:billing_company";
    public static  final String EMAIL = "id:billing_email";
    public static  final String TELEFONO = "id:billing_phone";
    public static  final String PAIS = "id:s2id_autogen1";
    public static  final String SELECIONAR_PAIS = "xpath://*[@id='select2-results-1']/li[1]";
    public static  final String DIRECCION = "id:billing_address_1";
    public static  final String DPTO = "id:billing_address_2";
    public static  final String CIUDAD = "id:billing_city";
    public static  final String PROVINCIA ="id:s2id_autogen2";
    public static  final String SELECIONAR_PROVINCIA = "xpath://*[@class='select2-results']/li[1]";
    public static  final String CP = "id:billing_postcode";
    public static  final String NOTA = "id:order_comments";
    public static  final String FORMAS_DE_PAGO_TRANSFERENCIA = "xpath://label[contains(.,'Direct Bank Transfer')]";
    public static  final String FORMAS_DE_PAGO_CHEQUE = "xpath://label[contains(.,'Check Payments')]";
    public static  final String FORMAS_DE_PAGO_CONTRAREEMBOLSO = "xpath://label[contains(.,'Cash on Delivery')]";
    public static  final String FORMAS_DE_PAGO_PAYPAL = "xpath://label[contains(.,'PayPal Express Checkout')]";
    public static  final String CONFIRMACION = "xpath://div[@class='form-row place-order']";
    public static  final String ATRIBUTOID_BOTON = "id:place_order";
    public static  final String MENSAJE = "xpath://p[@class='woocommerce-thankyou-order-received']";
    public static  final String PAGO = "xpath://td[text()='Direct Bank Transfer']";
    public static  final String TOTAL_DETALLE = "xpath://span[@class='woocommerce-Price-amount amount']";
    public static  final String PRODUCTO = "xpath://td[@class='product-name']";
}
