package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	private static WebDriver driver = null;
	private String strurl = "https://www.facebook.com";
	//create reference object of objSeleniumWrapperFunctions
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	
	public void initializedWebEnvironment() {

		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\lenovo\\workspace\\FacebookTAF\\ExternalResources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			objSeleniumWrapperFunctions= new SeleniumWrapperFunctions(this);
			
			this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
			
			driver.get(strurl);
			System.out.println("open URL  :" + strurl);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Test Script Pass");
			System.out.println("===================================================================");
			
		}
	}
	public WebDriver getDriver()
	{
		return driver;
		
	}
	
	public SeleniumWrapperFunctions getObjSeleniumWrapperFunctions() {
		return objSeleniumWrapperFunctions;
	}
	public void setObjSeleniumWrapperFunctions(SeleniumWrapperFunctions objSeleniumWrapperFunctions) {
		this.objSeleniumWrapperFunctions = objSeleniumWrapperFunctions;
	}
	
	public void tearDown() {

		{
			driver.close();
			System.out.println("Close The Browser ");
			System.out.println("===================================================================");

		}

	}

}
