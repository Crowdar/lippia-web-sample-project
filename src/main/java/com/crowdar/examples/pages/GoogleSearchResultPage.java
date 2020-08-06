package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleSearchResultPage extends PageBaseGoogle {

    private WebElement stats() {
        return getWebElement(By.id("rcnt"));
    }

    public GoogleSearchResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public String getStats() {
        return stats().getText();
    }

}
