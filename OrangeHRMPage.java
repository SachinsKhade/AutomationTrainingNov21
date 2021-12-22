package com.OrangeHRM.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.BaseTest;

public class OrangeHRMPage {

	private static WebDriver driver = null;
	private BaseTest objBaseTest;

	public OrangeHRMPage(BaseTest basetest) {
		this.objBaseTest = basetest;
	}
	// Locators

	By loc_strUserName = By.xpath("//input[@id='txtUsername']");
	By loc_strPassWord = By.xpath("//input[@id='txtPassword']");
	By loc_strSigIN = By.xpath("//input[@id='btnLogin']");
	// By loc_dragdrop = By.xpath("//a[@href='/drag_and_drop']");
	// By loc_fromdragdrop = By.xpath("//div[@id='column-a']");
	// By loc_todragdrop = By.xpath("//div[@id='column-b']");
	// By loc_checkboxPage = By.xpath("//ul/li/a[text()='Checkboxes']");
	// By loc_chkCheckbox1 = By.xpath("//form[@id='checkboxes']/input[1]");

	public void verifyOrangeHRMPageIsDispyaed() {

		String strOrangeHRMURL = objBaseTest.getDriver().getCurrentUrl();
		System.out.println("Loading site..." + strOrangeHRMURL);
		Assert.assertTrue(strOrangeHRMURL.equals("https://opensource-demo.orangehrmlive.com/"));

	}

	/*public void verifyLoginTest() {
		String strUserName = "Admin";
		String strPassword = "admin123";
		objBaseTest.getObjSeleniumWrapperFunctions().login(loc_strUserName, loc_strPassWord, strUserName, strPassword,
				loc_strSigIN);

		// Assert.assertTrue(strOrangeHRMURL.equals("https://opensource-demo.orangehrmlive.com/"));

	}
*/
}
