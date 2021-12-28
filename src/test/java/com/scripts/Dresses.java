package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flow.LoginLogOutFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;
import com.pageFactory.myAccoutPage;

public class Dresses {

	public class LoginLogoutTest extends BaseTest{
		//static WebDriver driver =null;
		//com.pageFactory.loginPage objloginPage;
		private LoginPage objLoginPage;
		private LoginLogOutFlow objLoginLogOutFlow;
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
		public  void  TCID003_verifyDressesButtonFunctionality() {
	
	objmyAccoutPage.ClickDressesInTab();
		

	}
	}



}
