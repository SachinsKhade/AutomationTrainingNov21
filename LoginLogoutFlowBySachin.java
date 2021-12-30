package com.flows;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.flows.commonFlows.CommonFlow;
import com.generic.Pojo;
import com.pageFactory.DashboardPage;
import com.pageFactory.LoginPage;
import com.pageFactory.LoginPageBySachin;
import com.popupFactory.ConfirmLogOffPopUpPage;
import com.popupFactory.SelectRolePopUpPage;

import ru.yandex.qatools.allure.annotations.Step;

public class LoginLogoutFlowBySachin {

	// Global Variable
	private Pojo objPojo;
	private String strUniqueKey = "";
	private String testData = "", testData_2 = "";
	private Integer intTestData = null;
	private Integer intTestData_1 = null;
	private String strReturnVal = "";
	private String strReturnVal_1 = "";
	private int intReturnVal = 0;
	private boolean blnReturnStatus = false;
	private double dblReturnVal = 0.0;
	private List<WebElement> listReturnElement;
	private WebElement weReturnElement;
	private int intRow = 0;
	private int intColumn = 0;

	// Reference object of Pages
	private LoginPageBySachin objLoginPageBySachin;
	private CommonFlow objCommonFlow;
	private SelectRolePopUpPage objSelectRolePopUpPage;
	private DashboardPage objDashboardPage;
	private ConfirmLogOffPopUpPage objConfirmLogOffPopUpPage;

	// Constructor of class
	public LoginLogoutFlowBySachin(Pojo pojo) {
		this.objPojo = pojo;
		objLoginPageBySachin = new LoginPageBySachin(objPojo);
		objCommonFlow = new CommonFlow(objPojo);
		objSelectRolePopUpPage = new SelectRolePopUpPage(objPojo);
		objDashboardPage = new DashboardPage(objPojo);
		objConfirmLogOffPopUpPage = new ConfirmLogOffPopUpPage(objPojo);
	}
	
	@Step("Login into the system.")
	public void doLoginWithExcelParameter() {
		testData = objPojo.getObjUtilities().dpString("userid");
		if (!testData.equals(""))
			objLoginPageBySachin.setUserID(testData);
		testData = objPojo.getObjUtilities().dpString("userpasswd");
		if (!testData.equals(""))
			objLoginPageBySachin.setPassword(testData);
		testData = objPojo.getObjUtilities().dpString("LoginWithOption");
		if(!testData.equals(""))
			objLoginPageBySachin.selectLoginWithOptions(testData);
		objLoginPageBySachin.clickGetStarted();
		objSelectRolePopUpPage.verifySelectRolePopupPageIsDisplayed();
		testData = objPojo.getObjUtilities().dpString("SelectUserRole");
		if(!testData.equals(""))
			objSelectRolePopUpPage.selectUserRole(testData);
		objSelectRolePopUpPage.clickProceedOnSelectRolePopupPage();
		 objPojo.getObjWrapperFunctions().waitForLoaderToDisappear();
		testData = objPojo.getObjUtilities().dpString("loginTitle");
		if(!testData.equals(""))
			objLoginPageBySachin.verifyUserLoggedIn(testData);
	}
	
	@Step("Logout eMedicareSync application")
	public void doLogout(){
		if(objDashboardPage.isCloseCrossButtonIsDisplayed())
			objDashboardPage.clickCrossCloseButton();
			
		objDashboardPage.clickUserIcon();
		if(objDashboardPage.isLogOffPopUpIsDisplayed()){
			objDashboardPage.clickLogOff();
			objDashboardPage.verifyPageHeaderIsDisplayed("Confirm Log Off");
			objConfirmLogOffPopUpPage.clickYesOrNoOnConfirmLogOffPopupPage("Yes");
		}else {
			objDashboardPage.clickUserIcon();
			objDashboardPage.clickLogOff();
			objDashboardPage.verifyPageHeaderIsDisplayed("Confirm Log Off");
			objConfirmLogOffPopUpPage.clickYesOrNoOnConfirmLogOffPopupPage("Yes");
		}
		
		
	}
	
	
	/*@Step("Login into the system.")
	public void doLogin(String strUserName, String strPassword,String strLoginWithOption,String strSelectUserRole) {
		testData = objPojo.getObjUtilities().dpString("userid");
		if (!testData.equals(""))
			LoginPageBySachin.setUserID(testData);
		testData = objPojo.getObjUtilities().dpString("userpasswd");
		if (!testData.equals(""))
			LoginPageBySachin.setPassword(testData);
		testData = objPojo.getObjUtilities().dpString("LoginWithOption");
		if(!testData.equals(""))
			LoginPageBySachin.selectLoginWithOptions(testData);
		LoginPageBySachin.clickGetStarted();
		objSelectRolePopUpPage.verifySelectRolePopupPageIsDisplayed();
		testData = objPojo.getObjUtilities().dpString("SelectUserRole");
		if(!testData.equals(""))
			objSelectRolePopUpPage.selectUserRole(testData);
		objSelectRolePopUpPage.clickProceedOnSelectRolePopupPage();
		objPojo.getObjWrapperFunctions().waitForLoaderToDisappear();
	}

	
*/
}
