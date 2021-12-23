package com.scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flow.LoginLogOutFlow;
import com.flow.LoginLogOutFlow;
import com.generic.BaseTest;
import com.generic.seleniumwrapperfunction;
import com.generic.utility;
import com.pageFactory.LoginPage;
import com.pageFactory.myAccoutPage;

	public class loginLogoutTest extends BaseTest{
		//static WebDriver driver =null;
		//com.pageFactory.loginPage objloginPage;
		private LoginPage objLoginPage;
		private LoginLogOutFlow  objLoginLogOutFlow;
		private  myAccoutPage objmyAccoutPage;
	
		
		
		public void initilizeWebPagesAndFlows()
		{
			objLoginPage =new LoginPage(this);
			objLoginLogOutFlow = new LoginLogOutFlow(this);
			objmyAccoutPage = new  myAccoutPage(this);
		}
			
		
		@BeforeClass
		public void beforeMainMethod()
		{
			this.initializedWebEnvironment();
			this.initilizeWebPagesAndFlows();
			
		}
			
		@AfterClass
		public void afterMethod()
		{
			//this.tearDown();
			
		}
	@Test
		public  void  TCID001_verifyLoginFunctionality() {
		
		//  Verify Page Is Displayed 
		objLoginPage.verifyLoginPageisDisplayed();
		//doing flow 
		objLoginLogOutFlow.doLogin();
		// verification point 
		objmyAccoutPage.verifyUserLogedInSuccessfully();
	}
	@Test
	public void TCID002_verifyMyAccountPageFunctionality()
	{
		objmyAccoutPage.verifyWomenTabIsDisplayedOnMyAccountPage();
		objmyAccoutPage.verifyDresesTabIsDisplayedOnMyAccountPage();
	}
	}



