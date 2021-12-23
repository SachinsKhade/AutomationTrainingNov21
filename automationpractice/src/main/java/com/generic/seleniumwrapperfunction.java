package com.generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class seleniumwrapperfunction {

	private static BaseTest objBaseTest;

	public seleniumwrapperfunction(BaseTest basetest) {
		this.objBaseTest = basetest;
	}

	public boolean setText(By locator, String strInputValue) {
		try {
			objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
			return true;
		} catch (Exception exception) {
			System.out.println("got exception :" + exception.getMessage());
			exception.printStackTrace();
			return false;

		}

	}

	public boolean click(By locator) {
		// objBaseTest.getDriver().findElement(locator).click();
		// System.out.println("Click : ");

		try {
			objBaseTest.getDriver().findElement(locator).click();
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	public void getText(By locator) {
		objBaseTest.getDriver().findElement(locator).getText();
	}

	public boolean selectRadioButton(By locator) {
		try {
			objBaseTest.getDriver().findElement(locator).click();
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	public static WebElement getElement(By Locator) {
		return objBaseTest.getDriver().findElement(Locator);

	}

	public boolean selectDropDown(By locator, String strDropDownOptions, String strOptionType) {
		try {

			if (strDropDownOptions.equals("Text")) {
				WebElement dropDown = objBaseTest.getDriver().findElement(locator);
				Select selectDropDown = new Select(dropDown);
				selectDropDown.selectByVisibleText(strDropDownOptions);
			} else if (strDropDownOptions.equals("Value")) {
				WebElement dropDown = objBaseTest.getDriver().findElement(locator);
				Select selectDropDown = new Select(dropDown);
				selectDropDown.selectByValue(strDropDownOptions);
			} else if (strDropDownOptions.equals("index")) {
				WebElement dropDown = objBaseTest.getDriver().findElement(locator);
				Select selectDropDown = new Select(dropDown);
				selectDropDown.selectByValue(strDropDownOptions);

			}
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}

	public boolean Refresh(By locator) {

		try {
			objBaseTest.getDriver().navigate().refresh();
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	public boolean back(By locator) {

		try {
			objBaseTest.getDriver().navigate().back();
			;
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	public boolean dragAndDrop(By draglocator, By droplocator) {
		try {
			// WebElement on which drag and drop operation needs to be performed
			WebElement fromElement = objBaseTest.getDriver().findElement(draglocator);

			// WebElement to which the above object is dropped
			WebElement toElement = objBaseTest.getDriver().findElement(droplocator);

			// Creating object of Actions class to build composite actions
			Actions builder = new Actions(objBaseTest.getDriver());

			// Building a drag and drop action
			Action dragAndDrop = builder.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build();
			dragAndDrop.perform();
			return true;
		} catch (Exception e) {
			System.out.println("I got exception:" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	// new method
	public boolean isSelected(By locator) {
		try {
			Boolean bolVar = objBaseTest.getDriver().findElement(locator).isSelected();
			return bolVar;

		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			return false;
		}
	}

	public boolean navigate() {
		try {
			objBaseTest.getDriver().navigate().back();
			;
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}

	public boolean fileUpload(By locator) {
		try {
			WebElement uploadElement = objBaseTest.getDriver().findElement(locator);

			// enter the file path onto the file-selection input field
			uploadElement.sendKeys("C:\\newhtml.html");

			// check the "I accept the terms of service" check box
			objBaseTest.getDriver().findElement(locator).click();

			// click the "UploadFile" button
			objBaseTest.getDriver().findElement(locator).click();
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;

		}

	}
	//Generic method for nevigate to
	public boolean navigateTo(String locator) {
		try {
			objBaseTest.getDriver().navigate().to(locator);
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
}
	
	public boolean login(By usernameLocator, By passwordLocator,String username,String password,By signinLocator ) {
		try {
		// Enter User Name
		//WebElement userName = driver.findElement(By.id("loginID"));
		objBaseTest.getDriver().findElement(usernameLocator).sendKeys(username);
		System.out.println(username);
		System.out.println(password);
		// Enter Password
		 WebElement strsihnup = objBaseTest.getDriver().findElement(passwordLocator);
		 strsihnup.clear();
		 strsihnup.sendKeys(password);
		// Click on the Sign In Button
		objBaseTest.getDriver().findElement(signinLocator).click();

		return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;	
		}
		}
	

	
	public boolean isDisplayed(By locator)
	{
	try
	{
	objBaseTest.getDriver().findElement(locator).isDisplayed();
	return true;

	}
	catch(Exception exception)
	{
	System.out.println("I got exception : "+exception.getMessage());
	return false;
	}
	}
}


