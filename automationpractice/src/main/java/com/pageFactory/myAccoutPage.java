package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.BaseTest;

public class myAccoutPage {
	private static WebDriver driver = null;
	private BaseTest objBaseTest;

	public myAccoutPage(BaseTest basetest) {
		this.objBaseTest = basetest;
	}
	
	By loc_btnSignOut=By.xpath("//a[@href='http://automationpractice.com/index.php?mylogout=']");
	By loc_btnWomen=By.xpath("//a[@title='Women']");
	By loc_btnDreses=By.xpath("//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]");
	By loc_btnTshirt=By.xpath("//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]");
	By loc_linkOrderHistoryAndDetails=By.xpath("//span[normalize-space()='Order history and details']");
	By loc_linkMywishlists=By.xpath("//span[normalize-space()='My wishlists']");
	By loc_lnkMyCreditSlips=By.xpath("//span[normalize-space()='My credit slips']");
	By loc_lnkMyAddresses=By.xpath("//span[normalize-space()='My addresses']");
	By loc_lnkMyPersonalInformation=By.xpath("//span[normalize-space()='My personal information']");
	By loc_btnViewMyShoppingCart=By.xpath("//a[@title='View my shopping cart']");
	By loc_inpSearch_Query_Top=By.xpath("//input[@id='search_query_top']");
	

	public void verifyUserLogedInSuccessfully()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_btnSignOut));
	}
	 
	public void verifyWomenTabIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_btnWomen));
	}
	
	public void verifyDresesTabIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_btnDreses));
	}
	
	public void verifyTShirtTabIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_btnTshirt));
	}
	
	public void verifyMywishlistsIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_linkMywishlists));
	}
	
	public void verifylinkOrderHistoryAndDetailsIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_linkOrderHistoryAndDetails));
	}
	
	public void verifylinkMyCreditSlipsDetailsIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_lnkMyCreditSlips));
	}
	
	
	public void verifyinpSearch_Query_TopIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_btnViewMyShoppingCart));
	}
	public void verifyMyViewMyShoppingCartIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_inpSearch_Query_Top));
	}
	
	public void verifyMyPersonalInformationIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_lnkMyPersonalInformation));
	}
	
	public void verifylnkMyAddressesIsDisplayedOnMyAccountPage()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_lnkMyAddresses));
	}
}
