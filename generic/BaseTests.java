package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
	private static WebDriver driver = null;
	private String strurl = "https://www.cleartrip.com/";
	// create reference object of objSeleniumWrapperFunctions
	private seleniumWrapperFunction objSeleniumWrapperFunction;

	public void initializedWebEnvironment() {

		{
			System.setProperty("webdriver.chrome.driver",
					 System.getProperty("user.dir")+"/ExternalResources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();

			objSeleniumWrapperFunction = new seleniumWrapperFunction(this);

			this.setObjSeleniumWrapperFunction(objSeleniumWrapperFunction);

			driver.get(strurl);
			System.out.println("open URL  :" + strurl);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Test Script Pass");
			System.out.println("===================================================================");

		}
	}

	public WebDriver getDriver() {
		return driver;

	}
	
	
	

	public seleniumWrapperFunction getObjSeleniumWrapperFunction() {
		return objSeleniumWrapperFunction;
	}

	public void setObjSeleniumWrapperFunction(seleniumWrapperFunction objSeleniumWrapperFunction) {
		this.objSeleniumWrapperFunction = objSeleniumWrapperFunction;
	}
	
	
	
	

	public void tearDown() {

		{
			driver.close();
			System.out.println("Close The Browser ");
			System.out.println("===================================================================");

		}

	}
}
