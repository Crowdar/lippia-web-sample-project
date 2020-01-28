package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.crowdar.core.pageObjects.PageBaseWeb;

public class PageBaseGoogle extends PageBaseWeb {

    public PageBaseGoogle(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "http://www.google.com.ar";
    }


}
