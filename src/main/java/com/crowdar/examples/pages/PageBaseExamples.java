package com.crowdar.examples.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.CucumberPageBase;
import com.crowdar.core.PageBase;

public class PageBaseExamples extends CucumberPageBase {

    public PageBaseExamples(SharedDriver driver){
        super(driver);
        BASE_URL = "http://www.crowdar.com.ar";
    }


}
