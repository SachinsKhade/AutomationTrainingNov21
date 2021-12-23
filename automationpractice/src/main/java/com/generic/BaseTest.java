package com.generic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest {
	private static WebDriver driver = null;
	private String strurl = "http://automationpractice.com/index.php?controller=authentication&back=my-account"; 
	private seleniumwrapperfunction objSeleniumWrapperFunction;
	public void initializedWebEnvironment() {

		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			objSeleniumWrapperFunction= new seleniumwrapperfunction(this);
			
			this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunction);
			
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
	
	public seleniumwrapperfunction getObjSeleniumWrapperFunctions() {
		return objSeleniumWrapperFunction;
	}
	public void setObjSeleniumWrapperFunctions(seleniumwrapperfunction objSeleniumWrapperFunctions) {
		this.objSeleniumWrapperFunction = objSeleniumWrapperFunctions;
	}
	
	public void tearDown() {

		{
			driver.close();
			System.out.println("Close The Browser ");
			System.out.println("===================================================================");

		}

	}

}
	
	
	

