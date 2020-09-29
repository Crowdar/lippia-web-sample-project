package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import static org.testng.Assert.*;

public class ShopHomePage extends PageBaseShop {

    public ShopHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    //definir como variables
    private final String BUTTON_SIGNIN_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";
    private final String EMAIL_INPUT_ID="email";
    private final String PASSWORD_INPUT_ID="passwd";
    private final String BUTTON_SIGNIN_ID = "SubmitLogin";
    private final String TITLE_ACCOUNT_CSS_SELECTOR = "#center_column > h1";
    private final String TITLE_HOME_CSS_SELECTOR = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a";
    private final String TITLE_MYACCOUNT_CSS_SELECTOR ="#center_column > h1";
    private final String SEARCH_INPUT_ID ="search_query_top";
    private final String SEARCH_BUTTON_CSS_SELECTOR ="#searchbox > button";
    private final String TITLE_PRODUCT_CSS_SELECTOR = "#center_column > h1 > span.lighter";
    private final String BUTTON_ADD_CSS_SELECTOR = "#add_to_cart > button > span";
    private final String TITLE_PRODUCTSEARCHED_CSS_SELECTOR = "#center_column > ul > li > div > div.right-block > h5 > a";
    private final String TITLE_PRODUCTSELECTED_CSS_SELECTOR= "#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1";
    private final String TEXT_PRODUCTADDED_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2";
    private final String TAB_SUMMARY_CSS_SELECTOR = "#order_step > li.step_current.first > span";
    private final String BUTTON_PROCEED_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span";
    private final String BUTTON_PROCEED_SUMMARY_CSS_SELECTOR = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span";
    private final String TITLE_ADDRESS_CSS_SELECTOR = "#center_column > h1";
    private final String TEXT_ADDRESS_ADDRESS_CSS_SELECTOR = "#address_delivery > li.address_address1.address_address2";
    private final String BUTTON_PROCEED_ADDRESS_CSS_SELECTOR = "#center_column > form > p > button > span";
    private final String TITLE_SHIPPING_CSS_SELECTOR = "#carrier_area > h1";
    private final String CHECKBOX_AGREE_ID="#uniform-cgv > span";
    private final String BUTTON_PROCEED_SHIPPING_CSS_SELECTOR = "#form > p > button > span";
    private final String TAB_PAYMENT_CSS_SELECTOR = "#step_end > span";
    private final String BUTTON_PAYBYBANK_CSS_SELECTOR = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a";
    private final String TITLE_BANKWIREPAYMENT_CSS_SELECTOR = "#center_column > form > div > h3";
    private final String BUTTON_CONFIRMORDER_CSS_SELECTOR = "#cart_navigation > button > span";
    private final String TEXT_CONFORMACION_COMPRA_CSS_SELECTOR = "#center_column > div > p > strong";

    public void go() {
        navigateToCompleteURL();
    }

    public void clickSignInButton(String button){
        switch (button){
            case "SignIn":
                clickElement(By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR));
                break;
            case"SignIn1":
                clickElement(By.id(BUTTON_SIGNIN_ID));
                break;
            case "Proceed": clickElement(By.cssSelector(BUTTON_PROCEED_CSS_SELECTOR));
                break;
            case "Proceed to checkout":
                clickElement(By.cssSelector(BUTTON_PROCEED_SUMMARY_CSS_SELECTOR));
                break;
            case "Proceed to checkout1":
                clickElement(By.cssSelector(BUTTON_PROCEED_ADDRESS_CSS_SELECTOR));
                break;
            case "Proceed to checkbox2":
                clickElement(By.cssSelector(BUTTON_PROCEED_SHIPPING_CSS_SELECTOR));
                break;
            case "Pay by bank":
                clickElement(By.cssSelector(BUTTON_PAYBYBANK_CSS_SELECTOR));
                break;
            case "confirm my order":
                clickElement(By.cssSelector(BUTTON_CONFIRMORDER_CSS_SELECTOR));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + button);

        }

    }

    public void completeEmailField(String email){
        completeField(By.id(EMAIL_INPUT_ID),email);

    }

    public void completePassField(String pass){
        completeField(By.id(PASSWORD_INPUT_ID),pass);
    }

    public void enterNameProduct(String nombreProducto){
        completeField(By.id(SEARCH_INPUT_ID),nombreProducto);
    }

    public void clickSigninButton3(){
        clickElement(By.cssSelector(SEARCH_BUTTON_CSS_SELECTOR));
    }

    public void clickSigninButton4(){
        clickElement(By.cssSelector(BUTTON_ADD_CSS_SELECTOR));
    }


    public void clickSigninButton5(){
        clickElement(By.cssSelector(TITLE_PRODUCTSEARCHED_CSS_SELECTOR));
    }


    public void verifyScreen1(String pantalla){
        assertTrue(isElementVisible(By.cssSelector(TEXT_PRODUCTADDED_CSS_SELECTOR)), "No se ha agregado el producto al carrito");
    }

    public void verificarHome(){
        assertTrue(isElementVisible(By.cssSelector(TITLE_HOME_CSS_SELECTOR)), "No se encuentra el titulo");
    }

    public void verificarLoginPage(String pantalla){
        switch(pantalla){
            case "login":
                assertTrue(isElementVisible(By.cssSelector(TITLE_ACCOUNT_CSS_SELECTOR)), "No se encuentra el titulo");
                break;
            case "My account":
                assertTrue(isElementVisible(By.cssSelector(TITLE_MYACCOUNT_CSS_SELECTOR)), "No se encuentra el titulo");
                break;
            case "Resultado de busqueda":
                assertTrue(isElementVisible(By.cssSelector(TITLE_PRODUCT_CSS_SELECTOR)),"No se encuentra el producto que buscas");
                break;
            case "Summary":
                assertTrue(isElementVisible(By.cssSelector(TAB_SUMMARY_CSS_SELECTOR)), "No se encuentra el titulo Summary");
                break;
            case "Address":
                assertTrue(isElementVisible(By.cssSelector(TITLE_ADDRESS_CSS_SELECTOR)), "No se encuentra el titulo ADDRESS");
                break;
            case "Shipping":
                assertTrue(isElementVisible(By.cssSelector(TITLE_SHIPPING_CSS_SELECTOR)), "No se encuentra el titulo ADDRESS");
                break;
            case "Payment":
                assertTrue(isElementVisible(By.cssSelector(TAB_PAYMENT_CSS_SELECTOR)), "No se encuentra el titulo ADDRESS");
                break;
            case "BANK-WIRE-PAYMENT":
                assertTrue(isElementVisible(By.cssSelector(TITLE_BANKWIREPAYMENT_CSS_SELECTOR)), "No se encuentra el titulo ADDRESS");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + pantalla);
        }
    }

    public void verificarLoginPage1(String pantalla){
        assertTrue(isElementVisible(By.cssSelector(TITLE_PRODUCT_CSS_SELECTOR)), "No se encuentra el titulo del producto");
    }

    public void verificarLoginPage2(String pantalla){
        assertTrue(isElementVisible(By.cssSelector(TITLE_PRODUCTSELECTED_CSS_SELECTOR)), "No se encuentra el titulo del producto");
    }

    public void verificarDatosAddress(String datosAddress){
        String actualString = driver.findElement(By.cssSelector(TEXT_ADDRESS_ADDRESS_CSS_SELECTOR)).getText();
        Assert.assertTrue(actualString.contains(datosAddress));
    }

    public void checkAgreeCheckbox(){
        clickElement(By.cssSelector(CHECKBOX_AGREE_ID));
    }

    public void verificarConfirmacionCompra(){
        String actualString = driver.findElement(By.cssSelector(TEXT_CONFORMACION_COMPRA_CSS_SELECTOR)).getText();
        Assert.assertTrue(actualString.contains("Your order on My Store is complete"));
    }
}
