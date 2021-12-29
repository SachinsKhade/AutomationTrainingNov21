package com.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseTest {
	protected static WebDriver driver = null;
	private String strURL = "";
	private seleniumwrapperfunction objSeleniumWrapperFunction;
	private Properties objConfig;

	public void initializedWebEnvironment() {

		{
			this.loadConfigproperties();
			 
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			objSeleniumWrapperFunction = new seleniumwrapperfunction(this);
			this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunction);
			strURL = objConfig.getProperty("AUT_URL");
			driver.get(strURL);
			driver.manage().window().maximize();
			objSeleniumWrapperFunction.setImplicitlyWait(20);
			System.out.println("open URL  :" + strURL);

			// driver.manage().deleteAllCookies();
			// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			System.out.println("Test Script Pass");
			System.out.println("===================================================================");
		}
	}

	public WebDriver getDriver() {
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

	// reusable Generic Method
	public void loadConfigproperties() {
		try {
			objConfig = new Properties();
			objConfig.load(new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/Configuration/appConfig.properties"));
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
		}
	}

	/*public void failedTestCases(String testMethodName) {

		File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(scrFile,
					new File("/Users/lenovo/workspace/automationpractice/src/test/resources/AllImages/" + testMethodName
							+ ".jpg"));
			
			
			
			//System.setProperty("org.uncommons.reportng.escape-output","false");
			//Reporter.log("<a href="+destinationFile+">Screenshot link</a>");



		} catch (IOException e) {

			e.printStackTrace();
		}
	}*/

	/*
	 * public static String getScreenShot(WebDriver driver) { TakesScreenshot
	 * ts=(TakesScreenshot) driver; File src
	 * =ts.getScreenshotAs(OutputType.FILE); String path =
	 * System.getProperty("user.dir")+"/AllImages/"+System.currentTimeMillis()+
	 * ".jpg";
	 *  File destination = new File(path);
	 * 
	 * try { FileUtils.copyFile(src, destination); } catch (IOException e) {
	 * System.out.println("Capture failed "+e.getMessage()); } return path;
	 * 
	 * }
	 * 
	 */
	
	public void getScreenShotPath(String testCaseName) throws IOException
	{
	TakesScreenshot screenShot =(TakesScreenshot)getDriver();
	System.out.println(screenShot);
	File source=screenShot.getScreenshotAs(OutputType.FILE);
	String destinationFile=System.getProperty("user.dir")+"\\screenshots\\"+testCaseName+".png";
	System.out.println(destinationFile);
	FileUtils.copyFile(source,new File(destinationFile));

	System.setProperty("org.uncommons.reportng.escape-output","false");
	Reporter.log("<a href="+destinationFile+">Screenshot link</a>");

	}
}