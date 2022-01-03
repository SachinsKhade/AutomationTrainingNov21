package com.flows;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.flows.commonFlows.CommonFlow;
import com.generic.FileFunctions;
import com.generic.Pojo;
import com.pageFactory.DashboardPage;
import com.pageFactory.LoginPage;
import com.popupFactory.ConfirmLogOffPopUpPage;
import com.popupFactory.SelectRolePopUpPage;

import ru.yandex.qatools.allure.annotations.Step;
public class DashboardFlowBySachin {

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
			private List<String> listReturnValue;
			private WebElement weReturnElement;
			private int intRow = 0;
			private int intColumn = 0;

			// Reference object of Pages
			private LoginPage objLoginPage;
			private CommonFlow objCommonFlow;
			private SelectRolePopUpPage objSelectRolePopUpPage;
			private DashboardPage objDashboardPage;
			private ConfirmLogOffPopUpPage objConfirmLogOffPopUpPage;

			// Constructor of class
			public DashboardFlowBySachin(Pojo pojo) {
				this.objPojo = pojo;
				objLoginPage = new LoginPage(objPojo);
				objCommonFlow = new CommonFlow(objPojo);
				objSelectRolePopUpPage = new SelectRolePopUpPage(objPojo);
				objDashboardPage = new DashboardPage(objPojo);
				objConfirmLogOffPopUpPage = new ConfirmLogOffPopUpPage(objPojo);
			}
			
			@Step("verify All Menu Items List On Dashboard page ")
			public void verifyAllMenuItemsListOnDashboard(){
				
				try {
					 listReturnValue=FileFunctions.readFileIntoList(System.getProperty("user.dir")+"/src/test/resources/testData/textFiles/TCID_01_MenuItemListBySachin.txt");
					for (String strValue : listReturnValue) {
						System.out.println("text file testData : "+strValue);
					}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
				if(objDashboardPage.isMenuItemIconIsDisplayed())
					objDashboardPage.clickMenuItemIconOnDashboardPage();
				for (int index = 0; index < listReturnValue.size(); index++) {
					String strMenuItemName = listReturnValue.get(index).trim();
					if(!strMenuItemName.equals("")){
						objPojo.getObjWrapperFunctions().waitFor(1);
						objDashboardPage.verifyAllMenuItemsIsDisplayedOnDashboardPage(strMenuItemName);
					}
				}
			}
			
			

	}
	

