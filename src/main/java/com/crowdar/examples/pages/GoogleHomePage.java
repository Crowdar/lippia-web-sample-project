package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleHomePage extends PageBaseGoogle {

    private final String INPUT_SEARCH_XPATH = "//input[@class='gLFyf gsfi']";
    private final String SEARCH_BUTTON_NAME = "btnK";
    private final String AGREE_BUTTON_XPATH = "//*[contains(text(),'I agree')]";

    public GoogleHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
        isPopUpDisplayed();
    }

    public void enterSearchCriteria(String text) {
        completeField(By.xpath(INPUT_SEARCH_XPATH), text);
    }

    public void clickSearchButton() {
        clickElement(By.name(SEARCH_BUTTON_NAME));
    }
    
    public void isPopUpDisplayed() {
    	if(isElementPresentAndDisplayed(By.xpath(AGREE_BUTTON_XPATH))){;
    		clickElement(By.xpath(AGREE_BUTTON_XPATH));
    	}
    }
}
