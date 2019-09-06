package com.crowdar.examples.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends PageBaseGoogle{

    private WebElement googleInput(){return getWebElement(By.xpath("//input[@class='gLFyf gsfi']"));}
    private WebElement googleSearchBtn(){return getWebElement(By.name("btnK"));}

    public GoogleHomePage(SharedDriver driver){
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go(){
        navigateToIt();
    }

    public void enterSearchCriteria(String palabra){
        googleInput().clear();
        googleInput().sendKeys(palabra);
    }

    public void clickSearchButton(){
        googleSearchBtn().click();
    }

}
