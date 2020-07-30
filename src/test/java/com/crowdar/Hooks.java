package com.crowdar;

import com.crowdar.driver.DriverManager;
import io.cucumber.java.After;


public class Hooks {

    @After
    public void afterScenario(){
        DriverManager.dismissCurrentDriver();
    }

}
