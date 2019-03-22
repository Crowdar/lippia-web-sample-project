package com.crowdar;

import com.crowdar.driver.DriverManager;
import cucumber.api.java.After;



public class Hooks {

    @After
    public void afterScenario(){
        DriverManager.dismissCurrentDriver();
    }

}
