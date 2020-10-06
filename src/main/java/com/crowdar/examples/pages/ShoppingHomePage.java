package com.crowdar.examples.pages;

import com.crowdar.core.Injector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShoppingHomePage extends PageBaseShopping {

    public ShoppingHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void verifyHome() {
        Assert.assertTrue(isPresent("shoppingHomePage.header_logo"), "El elemento no es visible");
    }

    public void clickButton(String button) {
        switch (button) {
            case "Sign in":
                clickSignInButton();
                break;
            case "Add to cart":
                Injector._page(ArticlePreferencesPage.class).clickAddToCartButton();
                break;
            case "Proceed to checkout":
                Injector._page(ShoppingHomePage.class).clickProceedToCheckButton(button);
                break;
            case "I confirm my order":
                Injector._page(OrderSummaryPage.class).clickConfirmOrderBtn();
                break;
            default:
                System.out.println("La opción que busca no está configurada");
                break;
        }
    }

    public void clickSignInButton() {
        if (isPresent("shoppingHomePage.sign_in_button")
                && isPresent("shoppingHomePage.sign_in")) {
            click("shoppingHomePage.sign_in");
        }
        if (isPresent("shoppingHomePage.sign_in_button")) {
            click("shoppingHomePage.sign_in_button");
        }
    }

    public void clickProceedToCheckButton(String button){
        if(isPresent("shipping.proc_to_checkout_btn")){
            Injector._page(ShippingPage.class).clickProceedToCheckout();
        } else {
            if(isPresent("addresses.proc_to_checkout_btn")){
                Injector._page(AddressesPage.class).clickProceedToCheckout();
            } else {
                if(isPresent("shoppingcart.proc_to_checkout_btn")){
                    Injector._page(ShoppingCartPage.class).clickProceedToCheckout();
                } else {
                    if(isPresent("articlePreferences.proc_to_checkout_btn")){
                        Injector._page(ArticlePreferencesPage.class).clickButton(button);
                    }
                }
            }
        }
    }

    public void redirectScreen(String window) {
        switch (window.toUpperCase()) {
            case "AUTHENTICATION":
                Injector._page(LoginPage.class).verifyLoginScreen();
                break;
            case "MY ACCOUNT":
                Injector._page(MyAccountPage.class).verifyAccountScreen();
                break;
            case "WOMEN":
            case "DRESSES":
            case "T-SHIRTS":
                Injector._page(ProductCategoryPage.class).verifyTabPage(window);
                break;
            case "ARTICLE PREFERENCES":
                Injector._page(ArticlePreferencesPage.class).verifyArticlePage();
                break;
            case "SHOPPING-CART SUMMARY":
                Injector._page(ShoppingCartPage.class).verifyShoppingCartPage();
                break;
            case "ADDRESSES":
                Injector._page(AddressesPage.class).verifyAddressesPage();
                break;
            case "SHIPPING":
                Injector._page(ShippingPage.class).verifyShippingPage();
                break;
            case "PLEASE CHOOSE YOUR PAYMENT METHOD":
                Injector._page(PaymentMethodPage.class).verifyPaymentMethodPage();
                break;
            case "ORDER SUMMARY":
                Injector._page(OrderSummaryPage.class).verifyOrderSummaryPage();
                break;
            case "ORDER CONFIRMATION":
                Injector._page(OrderConfirmationPage.class).verifyOrderConfirmationPage();
                break;
            default:
                System.out.println("La opción que busca no está configurada");
                break;


        }
    }


}
