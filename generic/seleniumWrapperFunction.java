package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class seleniumWrapperFunction {
	private static BaseTests objBaseTests;
	
	public seleniumWrapperFunction(BaseTests basetests)
	{
		this.objBaseTests=basetests;
	}
		
	public String setText(By locator ,String strInputValue )
	{
		objBaseTests.getDriver().findElement(locator).sendKeys(strInputValue);
		System.out.println(strInputValue);
		
		return strInputValue;
		
	}

	public static WebElement getElement(By Locator)
	{ 
		return objBaseTests.getDriver().findElement(Locator);

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
		objBaseTests.getDriver().findElement(locator).click();
		System.out.println("Click  : ");
	}


}
