package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class OrderConfirmationPage extends PageBaseShopping{

    public OrderConfirmationPage(RemoteWebDriver driver) {
        super(driver);
        this.url="";
    }

    public void verifyOrderConfirmationPage(){
        Assert.assertEquals(getText("orderConfirmation.h1_titlepage"), "ORDER CONFIRMATION");
    }

}
