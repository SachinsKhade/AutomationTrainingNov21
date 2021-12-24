package com.generic;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest {
	private static WebDriver driver = null;
	private String strURL = ""; 
	private seleniumwrapperfunction objSeleniumWrapperFunction;
	private Properties objConfig;
	public void initializedWebEnvironment() {

		{
			this.loadConfigproperties();
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			objSeleniumWrapperFunction= new seleniumwrapperfunction(this);
			this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunction);
			strURL=objConfig.getProperty("AUT_URL");
			driver.get(strURL);
			driver.manage().window().maximize();
			objSeleniumWrapperFunction.setImplicitlyWait(20);
			System.out.println("open URL  :" + strURL);
			
			//driver.manage().deleteAllCookies();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
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
	//reusable Generic Method
	public void loadConfigproperties()
	{
		try {
			objConfig = new Properties();
			objConfig.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Configuration/appConfig.properties"));
			} catch (Exception exception) {
			System.out.println("I got exception : "+exception.getMessage());
			exception.printStackTrace();
			}
	}

}
	
	
	

   