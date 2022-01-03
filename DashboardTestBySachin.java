package com.scripts.dashboard;
import java.lang.reflect.Method;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.flows.DashboardFlow;
import com.flows.LoginLogoutFlow;
import com.flows.commonFlows.CommonFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

public class DashboardTestBySachin extends BaseTest{
	// Global variables
		private CommonFlow objCommonFlow;
		private LoginPage objLoginPage;
		private DashboardFlow objDashboardFlow;
		private LoginLogoutFlow objLoginLogoutFlow;
		private String testCaseID="";

		// Initialize Flows
		public void initializeFlowsAndPages() {
			objCommonFlow = new CommonFlow(this);
			objLoginPage=new LoginPage(this);
			objLoginLogoutFlow = new LoginLogoutFlow(this);
			objDashboardFlow = new DashboardFlow(this);
		}

		@BeforeClass(groups = { "P1", "P2", "P3" })
		public void initializeEnvironment() {
			this.initializeWebEnvironment("excel/SSK");
			this.initializeFlowsAndPages();
		
		}

		@AfterClass(groups = { "P1", "P2", "P3" })
		public void tearDownEnvironment() {
			this.tearDownWebEnvironment();
			objCommonFlow = null;
			objLoginPage=null;

			
		}
		
		@BeforeMethod(groups = { "P1", "P2", "P3" })
		public void redirect_Me_To_HomePage_On_SH_Application(Method method) {
			testCaseID = method.getName();
			this.startTestExecutionVideoRecording(testCaseID);
			this.getObjWrapperFunctions().waitFor(5);
			System.out.println("Video Recording Started ....!!");
		}
		
		@AfterMethod
		public void stopVideoRecording(){
			this.stopTestExecutionVideoRecording();
			this.getObjWrapperFunctions().waitFor(5);
			objLoginLogoutFlow.doLogout();
			System.out.println("Video Recording Stopped ....!!");
		}
		

		@Title("TCID_01_VerifyMenuItemsListOnDashboard")
		@Description("To verify all the menu items in the left menu bar on Dashboard ")
		@Test(priority = 1, groups = { "P1" })
		public void TCID_01_VerifyMenuItemsListOnDashboard() {
			this.loadTestData("TCID_01_VerifyMenuItemsListOnDashboard");
			if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
				throw new SkipException("Run Mode 'No'");
			}
			objCommonFlow.openAUT_URL();
			objLoginLogoutFlow.doLoginWithExcelParameter();
			objDashboardFlow.verifyAllMenuItemsListOnDashboard();
		
			
		}

		
	}

