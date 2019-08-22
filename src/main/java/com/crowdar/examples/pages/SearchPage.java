package com.crowdar.examples.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends PageBaseExamples{

    public WebElement inicioMenuLink(){return getWebElement(By.xpath("//a[@href='#home']"));}
    public WebElement verMasLink(){return getWebElement(By.xpath("//a[@href='#brief']"));}
    public WebElement googleInput(){return getWebElement(By.xpath("//input[@class='gLFyf gsfi']"));}
    public WebElement googleSearchBtn(){return getWebElement(By.name("btnK"));}

    public SearchPage(SharedDriver driver){
        super(driver);
        this.url = "";
    }

    public void goToInit(){
        navigateToIt();
    }

    public void ingresarPalabra(String palabra){
        googleInput().clear();
        googleInput().sendKeys(palabra);
    }

    public void presionarBotonDeBusqueda(){
        googleSearchBtn().clear();
    }




}
