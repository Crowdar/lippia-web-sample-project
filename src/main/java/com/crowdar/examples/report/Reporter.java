package com.crowdar.examples.report;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crowdar.driver.DriverManager;

import io.lippia.reporter.cucumber4.adapter.ReportServerApiAdapter;

public class Reporter extends ReportServerApiAdapter{

	public Reporter(String arg) {
		super(arg);
	}

	@Override
	public String getBase64Image() {
		return  ((TakesScreenshot) DriverManager.getDriverInstance()).getScreenshotAs(OutputType.BASE64);
	}

}
 
