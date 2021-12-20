package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunctions {
	
private static BaseTest objBaseTest;
	
public SeleniumWrapperFunctions(BaseTest basetest)
{
	this.objBaseTest=basetest;
}
	
public boolean setText(By locator ,String strInputValue )
{
	/*objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
	System.out.println(strInputValue);
	
	return false;*/
	
	try {
		objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
		return true;
	} catch (Exception exception) {
		System.out.println("got exception :"+exception.getMessage());
		exception.printStackTrace();
		return false;
		
	}
	
}

public static WebElement getElement(By Locator)
{ 
	return objBaseTest.getDriver().findElement(Locator);

}

public static void doSelectByVisibleText(By Locator,String value)
{ 
Select select=new Select(getElement(Locator));
select.selectByVisibleText(value);
}

public static void doSelectByDropDownIndex(By Locator,String strday)
{ 
Select select=new Select(getElement(Locator));
select.selectByVisibleText(strday);
}

public static void doSelectByDropDownValue(By Locator,String  value)
{ 
Select select=new Select(getElement(Locator));
select.selectByValue(value);
}
public void click(By locator)
{ 
	objBaseTest.getDriver().findElement(locator).click();
	System.out.println("Click  : ");
}

public void getText(By locator)
{
	objBaseTest.getDriver().findElement(locator).getText();
}

public boolean setDropDown(By locator,String strDate)
{
try{
WebElement dropDown=objBaseTest.getDriver().findElement(locator);
Select selectDropDown=new Select(dropDown);
selectDropDown.selectByVisibleText(strDate);
return true;
}
catch(Exception exception)
{
System.out.println("I got exception : "+exception.getMessage());
exception.printStackTrace();
return false;
}
}

public boolean setRadioButton(By locator)
{
try{
objBaseTest.getDriver().findElement(locator).click();
return true;
}
catch(Exception exception)
{
System.out.println("I got exception : "+exception.getMessage());
exception.printStackTrace();
return false;
}
}
}
