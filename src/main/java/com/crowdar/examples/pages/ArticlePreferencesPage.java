package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;

public class ArticlePreferencesPage extends PageBaseShopping{

    private String SELECT_SIZE_ID = "group_1";

    public ArticlePreferencesPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyArticlePage() {
        waitPresence("articlePreferences.article_title");
        Assert.assertTrue(isPresent("articlePreferences.article_title"), "El elemento no es visible");
    }

    public void setSize(String size){
        selectOptionDropdownByText(By.id(SELECT_SIZE_ID), size);
    }

    public void setQuantity(String qtity){
        setInput("articlePreferences.input_quantity",qtity,true);
    }

    public void setColor(String color){
        List<WebElement> colorList = getElements("articlePreferences.list_colors");
        for (WebElement colorElement: colorList) {
            if(colorElement.getAttribute("name").toLowerCase().equals(color.toLowerCase())){
                colorElement.click();
                break;
            }
        }
    }

    public void clickButton(String boton){
        switch (boton){
            case "Add to cart": clickAddToCartButton(); break;
            case "Proceed to checkout": clickProceedToCheckButton(); break;
        }
    }

    public void clickAddToCartButton(){
        if(isPresent("articlePreferences.add_to_cart_btn")){
            click("articlePreferences.add_to_cart_btn");
        }
    }

    public void clickProceedToCheckButton(){
        if(isPresent("articlePreferences.proc_to_checkout_btn")){
            click("articlePreferences.proc_to_checkout_btn");
        }
    }



}
