package com.orangeHRM.Scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.OrangeHRM.PageFactory.OrangeHRMLoogInPage;
import com.OrangeHRM.PageFactory.OrangeHRMPage;
import com.generic.BaseTest;
import com.generic.Utilities;
public class OrangeHRMTest extends BaseTest {
	private static WebDriver driver =null;
			//com.HerokuApp.PageFactory.HerokuAppPage objHerokuAppPage;
			//com.OrangeHRM.PageFactory.OrangeHRMPage objorangeOrangeHRMPage;
			com.OrangeHRM.PageFactory.OrangeHRMLoogInPage objOrangeHRMLoogInPage;
			Utilities objUtilities;
			
			@BeforeClass
			public void beforeMainMethod()
			{
				this.initializedWebEnvironment();
				objOrangeHRMLoogInPage = new OrangeHRMLoogInPage(this);
				objUtilities = new Utilities();
			}
				
			@AfterClass
			public void afterMethod()
			{
				//this.tearDown();
				
			}
		@Test
		public  void  TCID001_orangeHRMSiteloadTest()
		{
			String struserName=objUtilities.generate_UserNmae();
			String strPassword=objUtilities.generate_PassWord();
			System.out.println("Random user Name is : "+struserName);
			System.out.println("Random PassWord Name is :"+strPassword);
			objOrangeHRMLoogInPage.enterUserName(struserName);
			objOrangeHRMLoogInPage.enterPassWord(strPassword);
			objOrangeHRMLoogInPage.clickOnSignIN();
			
		}	
			

		}

