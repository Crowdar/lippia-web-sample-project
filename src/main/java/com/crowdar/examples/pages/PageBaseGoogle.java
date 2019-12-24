package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBaseGoogle extends PageBaseWeb {

    public PageBaseGoogle(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "http://www.google.com.ar";
    }


}
