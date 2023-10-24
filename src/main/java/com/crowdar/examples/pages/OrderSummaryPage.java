package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class OrderSummaryPage extends PageBaseShopping{



    public OrderSummaryPage(RemoteWebDriver driver) {
        super(driver);
        this.url="";
    }

    public void verifyOrderSummaryPage(){
        Assert.assertEquals(getText("orderSummary.h1_titlepage"), "ORDER SUMMARY");
    }

    public void clickConfirmOrderBtn(){
        click("orderSummary.confirm_order_btn");
    }

}
