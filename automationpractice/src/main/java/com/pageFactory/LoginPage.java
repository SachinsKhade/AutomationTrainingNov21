package com.pageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.generic.BaseTest;
import java.net.URL;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

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
		Reporter.log("Verify Login Page is Displayed.", true);
	}

	public void setUserNameOnLoginPage(String strUserName) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_setUserName, strUserName));

	}

	public void setPassWordOnLoginPage(String strPassWord) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_setPassWord, strPassWord));
		Reporter.log("Set PassWord", true);
	}

	public void ClickSignInOnLoginPage() {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnSignIn));
		Reporter.log("Click on Button...", true);
	}

	public void getAllLinksPresentOnLogInPage() {
		objBaseTest.getObjSeleniumWrapperFunctions().setImplicitlyWait(7);
		List<WebElement> allLinksList = objBaseTest.getDriver().findElements(By.tagName("a"));
		System.out.println("Links List Size" + allLinksList.size());
		for (WebElement webElement : allLinksList) {

			Reporter.log("" + webElement.getText(), true);
		}
	}

	public void getAllBrokenLinksPresentOnLogInPage() {
		String homePage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		objBaseTest.getObjSeleniumWrapperFunctions().setImplicitlyWait(7);
		List<WebElement> allBrokenLinksList = objBaseTest.getDriver().findElements(By.tagName("a"));

		Iterator<WebElement> it = allBrokenLinksList.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if (!url.startsWith(homePage)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}
			} catch (MalformedURLException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
}
