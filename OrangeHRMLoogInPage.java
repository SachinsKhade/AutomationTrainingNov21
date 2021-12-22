package com.OrangeHRM.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.generic.BaseTest;

public class OrangeHRMLoogInPage {
	private static WebDriver driver = null;
	private BaseTest objBaseTest;

	public OrangeHRMLoogInPage(BaseTest basetest) {
		this.objBaseTest = basetest;
	}
	// Locators

	By loc_strUserName = By.xpath("//input[@id='txtUsername']");
	 By loc_strPassWord = By.xpath("//input[@id='txtPassword']");
	By loc_strSigIN = By.xpath("//input[@id='btnLogin']");

	public void enterUserName(String strUserName) {
		System.out.println("Enter User Name is: " + strUserName);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_strUserName, strUserName));

	}
	
	public void enterPassWord(String strPassWord) {
		System.out.println("Enter User Name is: " + strPassWord);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_strPassWord, strPassWord));

	}
	
	public void clickOnSignIN() {
		
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_strSigIN));

	}
}
