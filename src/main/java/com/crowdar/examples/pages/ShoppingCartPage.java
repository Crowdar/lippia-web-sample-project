package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShoppingCartPage extends PageBaseShopping{

    public ShoppingCartPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void verifyShoppingCartPage() {
        Assert.assertTrue(isPresent("shoppingCart.h1_titlepage"), "SHOPPING-CART SUMMARY");
    }

    public void clickProceedToCheckout(){
        click("shoppingcart.proc_to_checkout_btn", true);
    }

}
