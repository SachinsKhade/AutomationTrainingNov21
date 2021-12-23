package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.BaseTest;

public class LoginPage {

	private static WebDriver driver = null;
	private BaseTest objBaseTest;

	public LoginPage(BaseTest basetest) {
		this.objBaseTest = basetest;
	}
	// Locators

	By loc_hdrLogInPage = By.xpath("//h3[normalize-space()='Already registered?']");
	By loc_setUserName = By.xpath("//input[@id='email']");
	By loc_setPassWord = By.xpath("//input[@id='passwd']");
	By loc_btnSignIn = By.xpath("//span[normalize-space()='Sign in']");

	public void verifyLoginPageisDisplayed() {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_hdrLogInPage));
	}

	public void setUserNameOnLoginPage(String strUserName) {
		Assert.assertTrue(
				objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_setUserName, strUserName));
	}

	public void setPassWordOnLoginPage(String strPassWord) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_setPassWord,strPassWord));
	}

	public void ClickSignInOnLoginPage() {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnSignIn));
	}
}
