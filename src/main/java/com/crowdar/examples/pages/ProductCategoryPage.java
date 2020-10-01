package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;

public class ProductCategoryPage extends PageBaseShopping {

    public ProductCategoryPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }


    public void verifyTabPage(String categoryNavName) {

        if (categoryNavName.toUpperCase().equals("WOMEN")) {
            Assert.assertEquals(getText("productsCategoryPage.span_categoryname"), "Women");
        } else {
            if (categoryNavName.toUpperCase().equals("DRESSES")) {
                Assert.assertEquals(getText("productsCategoryPage.span_categoryname"), "Dresses");
            } else {
                if (categoryNavName.toUpperCase().equals("T-SHIRTS")) {
                    Assert.assertEquals(getText("productsCategoryPage.span_categoryname"), "T-shirts");
                }
            }
        }



    }

    public void clickArticle(String nomArticulo) {
        List<WebElement> listArticlesElements = getElements("productsCategoryPage.list_link_articles");
        for (WebElement articulo:listArticlesElements) {
            if(nomArticulo.equals(articulo.getAttribute("title"))){//tomamos el atributo title
                articulo.click();
                break;
            }

        }
    }

}
