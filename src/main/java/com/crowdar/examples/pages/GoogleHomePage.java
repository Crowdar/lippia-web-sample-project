package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleHomePage extends PageBaseGoogle {

    private final String INPUT_SEARCH_XPATH = "//input[@class='gLFyf gsfi']";
    private final String SEARCH_BUTTON_NAME = "btnK";

    public GoogleHomePage(RemoteWebDriver driver) {
        super(driver);
    }

    public void go() {
        navigateTo(BASE_URL);
    }

    public void enterSearchCriteria(String text) {
        completeField(By.xpath(INPUT_SEARCH_XPATH), text);
    }

    public void clickSearchButton() {
        clickElement(By.name(SEARCH_BUTTON_NAME));
    }

}
