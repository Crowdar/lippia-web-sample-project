package com.crowdar.examples.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inicio extends PageBaseExamples{

    public WebElement inicioMenuLink(){return getWebElement(By.xpath("//a[@href='#home']"));}
    public WebElement verMasLink(){return getWebElement(By.xpath("//a[@href='#brief']"));}

    public Inicio(SharedDriver driver){
        super(driver);
        this.url = "";
    }

    public void navegarAlInicio(){
        navigateToIt();
        sleep(15000);
    }


}
