package com.HerokuApp.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.BaseTest;

public class HerokuAppPage {
	
	private static WebDriver driver = null;
	private BaseTest objBaseTest;

	public HerokuAppPage(BaseTest basetest) {
		this.objBaseTest = basetest;
	}

	// Locators

	By loc_heroKuappWelcomPage = By.xpath("//h1[@class='heading']");
	By loc_liABTestingLink = By.xpath("//a[@href='/abtest']");
	By loc_lielementalSeleniumLink = By.xpath("//a[@href='http://elementalselenium.com/']");
	By loc_dragdrop = By.xpath("//a[@href='/drag_and_drop']");
	By loc_fromdragdrop = By.xpath("//div[@id='column-a']");
	By loc_todragdrop = By.xpath("//div[@id='column-b']");
	By loc_checkboxPage = By.xpath("//ul/li/a[text()='Checkboxes']");
	By loc_chkCheckbox1 = By.xpath("//form[@id='checkboxes']/input[1]");
	

	public void verifyHerokuAppPageIsDispyaed() {

		String strAccountText = objBaseTest.getDriver().findElement(loc_heroKuappWelcomPage).getText();
		System.out.println(strAccountText);
		Assert.assertTrue(strAccountText.equals("Welcome to the-internet"));

	}
	public void verifyABTestingLink()
	{ 
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_liABTestingLink));
		objBaseTest.getObjSeleniumWrapperFunctions().back(loc_liABTestingLink);
	}
	
	public void Refresh() {
		objBaseTest.getObjSeleniumWrapperFunctions().Refresh(loc_heroKuappWelcomPage);
	}
	
	public void performDragAndDropOpration()
	{
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_dragdrop);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().dragAndDrop(loc_fromdragdrop, loc_todragdrop));
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().back(loc_dragdrop));
	
	}
	
	public void verifyCheckBox()
	{
	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_checkboxPage));
	if(objBaseTest.getObjSeleniumWrapperFunctions().isSelected(loc_chkCheckbox1)==true)
	{
	//for deselect
	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_chkCheckbox1));
	}
	else
	{
	//for select
	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_chkCheckbox1));
	}
	objBaseTest.getObjSeleniumWrapperFunctions().back(loc_chkCheckbox1);
	}
	}
	
	

