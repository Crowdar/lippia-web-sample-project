package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;

public class MyAccountPage extends PageBaseShopping {

    public MyAccountPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void verifyAccountScreen(){
        waitPresence("account.h1_titlepage");
        Assert.assertEquals(getElement("account.h1_titlepage").getText(), "MY ACCOUNT");
    }


    public void clickTabPage(String categoryNavName) {
        List<WebElement> list_tabs = getElements("account.list_tabs");
        for (WebElement tab : list_tabs) {
            String tabName = tab.getText().toUpperCase();
            if (tabName.toUpperCase().equals(categoryNavName.toUpperCase())) {
                click(tab);
                break;
            }
        }
    }

}
