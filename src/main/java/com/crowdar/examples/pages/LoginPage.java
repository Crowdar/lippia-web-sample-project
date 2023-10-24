package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class LoginPage extends PageBaseShopping {

    public LoginPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void verifyLoginScreen() {
        waitPresence("login.h3_title_form");
        Assert.assertEquals(getText("login.h3_title_form"), "ALREADY REGISTERED?");
    }

    public void setEmail(String email){
        if (isPresent("login.email_input")){
            setInput("login.email_input",email);
        }
    }

    public void setPassword(String pass){
        if (isPresent("login.pass_input")){
            setInput("login.pass_input",pass);

        }

    }


}
