package com.scripts.login;

import java.lang.reflect.Method;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flows.LoginLogoutFlow;
import com.flows.LoginLogoutFlowBySachin;
import com.flows.commonFlows.CommonFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;
import com.pageFactory.LoginPageBySachin;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

public class LoginLogoutTestBySachin extends BaseTest {

	// Global variables
	private CommonFlow objCommonFlow;
	// private LoginPage objLoginPage;
	private LoginPageBySachin objLoginPageBySachin;
	// private LoginLogoutFlow objLoginLogoutFlow;
	private LoginLogoutFlowBySachin objLoginLogoutFlowBySachin;
	private String testCaseID = "";

	// Initialize Flows
	public void initializeFlowsAndPages() {
		objCommonFlow = new CommonFlow(this);
		objLoginPageBySachin = new LoginPageBySachin(this);
		objLoginLogoutFlowBySachin = new LoginLogoutFlowBySachin(this);
	}

	@BeforeClass(groups = { "P1", "P2", "P3" })
	public void initializeEnvironment() {
		this.initializeWebEnvironment("excel/SSK");
		this.initializeFlowsAndPages();

		objCommonFlow.setResourceName("Khushbu Borole");

	}

	@AfterClass(groups = { "P1", "P2", "P3" })
	public void tearDownEnvironment() {
		this.tearDownWebEnvironment();
		objCommonFlow = null;
		objLoginPageBySachin = null;

	}

	@BeforeMethod(groups = { "P1", "P2", "P3" })
	public void redirect_Me_To_HomePage_On_SH_Application(Method method) {
		testCaseID = method.getName();
		this.startTestExecutionVideoRecording(testCaseID);
		this.getObjWrapperFunctions().waitFor(5);
		System.out.println("Video Recording Started ....!!");
	}

	@AfterMethod
	public void stopVideoRecording() {
		this.stopTestExecutionVideoRecording();
		this.getObjWrapperFunctions().waitFor(5);
		System.out.println("Video Recording Stopped ....!!");
	}

	@Title("TCID_01_VerifyLoginFunctionality")
	@Description("Verify user should login into the system")
	// @Test(priority = 1, groups = { "P1" })
	public void TCID_101_VerifyLoginFunctionality() {
		this.loadTestData("TCID_01_VerifyLoginFunctionality");
		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
			throw new SkipException("Run Mode 'No'");
		}
		objCommonFlow.openAUT_URL();
		objLoginLogoutFlowBySachin.doLoginWithExcelParameter();
	}

	// for correct username wrong password
	@Title("TCID_02_VerifyInvalidPasswordErrorMsg")
	@Description("Verify user should get Invalid Password Error Msg")
	// @Test(priority = 1, groups = { "P1" })
	public void TCID_02_VerifyInvalidPasswordErrorMsg() {
		this.loadTestData("TCID_02_VerifyInvalidPasswordErrorMsg");
		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
			throw new SkipException("Run Mode 'No'");
		}
		objCommonFlow.openAUT_URL();
		objLoginLogoutFlowBySachin.doLoginWithExcelParameter();
	}

	// for wrong username correct password
	@Title("TCID_03_VerifyErrorMsg")
	@Description("Verify user should get Invalid Username or Password Error Msg")
	// @Test(priority = 1, groups = { "P1" })
	public void TCID_03_VerifyErrorMsg() {
		this.loadTestData("TCID_03_VerifyErrorMsg");
		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
			throw new SkipException("Run Mode 'No'");
		}
		objCommonFlow.openAUT_URL();
		objLoginLogoutFlowBySachin.doLoginWithExcelParameter();
	}

	// for correct username Blank password
	@Title("TCID_04_VerifyPasswordRequiredErrorMsg")
	@Description("Verify user should get Invalid Username or Password Error Msg")
	// @Test(priority = 1, groups = { "P1" })
	public void TCID_04_VerifyPasswordRequiredErrorMsg() {
		this.loadTestData("TCID_04_VerifyPasswordRequiredErrorMsg");
		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
			throw new SkipException("Run Mode 'No'");
		}
		objCommonFlow.openAUT_URL();
		objLoginLogoutFlowBySachin.doLoginWithExcelParameter();
	}

	// for Blank username correct password
	@Title("TCID_05_VerifyUsernameRequiredErrorMsg")
	@Description("Verify user should get Invalid Username or Password Error Msg")
	//@Test(priority = 1, groups = { "P1" })
	public void TCID_05_VerifyUsernameRequiredErrorMsg() {
		this.loadTestData("TCID_05_VerifyUsernameRequiredErrorMsg");
		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
			throw new SkipException("Run Mode 'No'");
		}
		objCommonFlow.openAUT_URL();
		objLoginLogoutFlowBySachin.doLoginWithExcelParameter();
	}

	// for Blank username Blank password
	@Title("TCID_06_VerifyBlankUsernameAndPasswordRequiredErrorMsg")
	@Description("Verify user should get Invalid Username or Password Error Msg")
	@Test(priority = 1, groups = { "P1" })
	public void TCID_06_VerifyBlankUsernameAndPasswordRequiredErrorMsg() {
		this.loadTestData("TCID_06_VerifyBlankUsernameAndPasswordRequiredErrorMsg");
		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
			throw new SkipException("Run Mode 'No'");
		}
		objCommonFlow.openAUT_URL();
		objLoginLogoutFlowBySachin.doLoginWithExcelParameter();
	}

	// logout Test
	@Title("TCID_07_VerifyLogoutFunctionality")
	@Description("Verify user should logout system")
	// @Test(priority = 2, groups = { "P1" })
	public void TCID_07_VerifyLogoutFunctionality() {
		this.loadTestData("TCID_07_VerifyLogoutFunctionality");
		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
			throw new SkipException("Run Mode 'No'");
		}
		objLoginLogoutFlowBySachin.doLogout();
	}

}
