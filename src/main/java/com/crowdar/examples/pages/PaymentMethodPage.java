package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PaymentMethodPage extends PageBaseShopping{

    public PaymentMethodPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyPaymentMethodPage(){
        Assert.assertTrue(isPresent("payment.h1_titlepage"), "El elemento no es visible");
    }



    public void choosePaymentMethodBtn(String button){

        switch (button.toUpperCase()){
            case "BANK WIRE":
                click("payment.bankwire_btn");
                break;
            case "CHECK":
                click("payment.cheque_btn");
                break;
        }
    }

}
