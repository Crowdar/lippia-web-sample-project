package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShippingPage extends PageBaseShopping{

    private String INPUT_CHECKBOX_TERMS_ID = "cgv";

    public ShippingPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyShippingPage(){
        Assert.assertEquals(getText("shipping.h1_titlepage"), "SHIPPING");
    }

    public void clickProceedToCheckout(){
        click("shipping.proc_to_checkout_btn",false);
    }

    public void clickTerms(){
        selectCheckbox(By.id(INPUT_CHECKBOX_TERMS_ID));
    }

}
