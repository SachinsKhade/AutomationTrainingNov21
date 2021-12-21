package com.HeroKuApp.Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.HerokuApp.PageFactory.HerokuAppPage;
import com.generic.BaseTest;
import com.generic.Utilities;

public class HerokuAppTest extends BaseTest {

		static WebDriver driver =null;
		com.HerokuApp.PageFactory.HerokuAppPage objHerokuAppPage;
		Utilities objUtilities;
		
		@BeforeClass
		public void beforeMainMethod()
		{
			this.initializedWebEnvironment();
			objHerokuAppPage = new HerokuAppPage(this);
			objUtilities = new Utilities();
		}
			
		@AfterClass
		public void afterMethod()
		{
			//this.tearDown();
			
		}
	@Test
	public  void  TCID001_HerokuApp()
	{
	
		objHerokuAppPage.verifyHerokuAppPageIsDispyaed();
		objHerokuAppPage.Refresh();
		objHerokuAppPage.verifyABTestingLink();
		objHerokuAppPage.performDragAndDropOpration();
		objHerokuAppPage.verifyCheckBox();
			
	}	
		

	}


