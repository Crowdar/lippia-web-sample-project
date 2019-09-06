package com.crowdar.examples.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.CucumberPageBase;
import com.crowdar.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBaseGoogle extends CucumberPageBase {

    public PageBaseGoogle(SharedDriver driver){
        super( driver);
        BASE_URL = "http://www.google.com.ar";
    }


}
