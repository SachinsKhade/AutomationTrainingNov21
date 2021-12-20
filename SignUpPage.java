package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class SignUpPage   {
	private static WebDriver driver = null;
	private BaseTest objBaseTest;  
	public SignUpPage(BaseTest basetest) {
		this.objBaseTest=basetest;
	}
	String actual_url = "https://www.facebook.com./";
	//Locators
	By loc_createNewAccount=By.xpath("//a[contains(@id,'u_0_2_')]");
	By loc_inpFirstame=By.xpath("//div[@id='reg_form_box']//input[@name='firstname']");
	By loc_inpSurName=By.xpath("//div[@id='reg_form_box']//input[@name='lastname']");
	By loc_inpMobileNumber=(By.xpath("//div[@id='reg_form_box']//input[@name='reg_email__']"));
	By loc_Password=(By.xpath("//div[@id='reg_form_box']//input[@type='password']"));
	By loc_Day=(By.xpath("//select[@id='day']"));
	By loc_month=(By.xpath("//select[@id='month']"));
	By loc_year=(By.xpath("//select[@id='year']"));
	By loc_gender_Female=(By.xpath("//label[normalize-space()='Female']"));
	By loc_inpMaleGender = By.xpath("//*[contains(text(),'Male')]");
	
	By loc_faceBookSignUPTest=By.xpath("//div[text()='Sign Up']");

	

	public void verifySignUpPageIsDispyaed() {
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_createNewAccount);
		String strAccountText=objBaseTest.getDriver().findElement(loc_faceBookSignUPTest).getText();
		Assert.assertTrue(strAccountText.equals("Sign Up" ));
		
		/*if(strAccountText.equals("Sign Up"))
		{
			System.out.println("Test Pass");
		}else{
			System.out.println("Test Fail");
		}*/
			
		/*System.out.println("Facebook Sign Up Page is Displayed");
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_createNewAccount);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");*/
	}

	public void setFirstName(String str_FirstName) {
		System.out.println("First Name is : ");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstame, str_FirstName));
		//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstame, str_FirstName);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void setSurname(String strSurname) {
		System.out.print("Set Surname :");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpSurName, strSurname));
	//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpSurName, strSurname);

		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

public void setMobileNumber(String srrmobile) {
		System.out.print("Set Mobile Number  :");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpMobileNumber, srrmobile));
		//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpMobileNumber, srrmobile);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

/*public void setEmailID(String strEmailId) {
		System.out.print("SetEmail-Id :");
		this.setText(strEmailId);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}
*/
public void setPasswaord(String strPassword) {
		System.out.print("Set Password :");
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_Password, strPassword));
//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_Password, strPassword);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");

	}

	public void selectDay(String strday) {
		
		System.out.print("Set Day is :");

		System.out.println("Date is : " + strday);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setDropDown(loc_Day,strday));
		/*objBaseTest.getObjSeleniumWrapperFunctions().getElement(loc_Day);
		objBaseTest.getObjSeleniumWrapperFunctions().doSelectByDropDownIndex(loc_Day, strday);
		System.out.println(strday);

				System.out.println("Test Script Pass");
				System.out.println("===================================================================");
*/
			}

	public void selectMonth(String strMonnths) {
		System.out.println("Select Month :"+strMonnths);
		//System.out.println("Date is : " + strday);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setDropDown(loc_month,strMonnths));
		/*objBaseTest.getObjSeleniumWrapperFunctions().getElement(loc_month);
		objBaseTest.getObjSeleniumWrapperFunctions().doSelectByDropDownIndex(loc_month, strMonnths);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");*/
	}
	


		public void selectYear(String strYears) {
		System.out.println("Select Year :" );
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setDropDown(loc_year,strYears));
		/*objBaseTest.getObjSeleniumWrapperFunctions().getElement(loc_year);
		objBaseTest.getObjSeleniumWrapperFunctions().doSelectByDropDownValue(loc_year, strYears);
		System.out.print("Test Script Pass");
		System.out.println("===================================================================");*/
		
	}

		/*public void selectGender(String strGender) {
		System.out.print("Select Gender :");
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_gender);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}
	*/
		


	/*	public void selectGender(String strGetGender) {
			
			

			String strAllGender[] = { "Custom", "Male", "Female" };


				if (strGetGender.equalsIgnoreCase("Male"))

					objBaseTest.getObjSeleniumWrapperFunctions().click(loc_inpMaleGender);

				else if (strGetGender.equalsIgnoreCase("Female"))

					objBaseTest.getObjSeleniumWrapperFunctions().click(loc_gender_Female
							);

		}
		*/
		
		public void selectGender(String strGender) {

			if (strGender.equalsIgnoreCase("Male"))
			{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setRadioButton(loc_inpMaleGender));
			}
			else if(strGender.equalsIgnoreCase("Female"))
			{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setRadioButton(loc_gender_Female));
			}
			else
			{
			System.out.println("Invalid Gender");
			}
			}

		public void verifySignUpButton()
		{
		System.out.println("Facebook Sign Up Button is working");
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");

	}

}
