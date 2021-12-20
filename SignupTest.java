package com.scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.generic.Utilities;
import com.pageFactory.SignUpPage;

public class SignupTest extends BaseTest{
	static WebDriver driver =null;
	com.pageFactory.SignUpPage objSignUpPage;
	Utilities objUtilities;
	@BeforeClass
	public void beforeMainMethod()
	{
		this.initializedWebEnvironment();
		objSignUpPage = new SignUpPage(this);
		objUtilities = new Utilities();
	}
		
	@AfterClass
	public void afterMethod()
	{
		//this.tearDown();
		
	}
@Test
	public  void  TCID001_FbSignUp() {
	objSignUpPage.verifySignUpPageIsDispyaed();
	String strFirstNmae = objUtilities.getRandomFirstName()+objUtilities.getRandomStrings(4);
	objSignUpPage.setFirstName(strFirstNmae);
	
	String strSurNmae = objUtilities.getRandomSurname()+objUtilities.getRandomStrings(4);
	objSignUpPage.setSurname(strSurNmae);
	
	String strMobile = objUtilities.getRandomMobile_Number()+objUtilities.getRandomMobile(7);
	objSignUpPage.setMobileNumber(strMobile);
	
	String strPasswaord=objUtilities.getRandomPassword();
	objSignUpPage.setPasswaord(strPasswaord);
	
	String strday=objUtilities.getRandomDay();
	objSignUpPage.selectDay(strday);
	
	
	String strMonth=objUtilities.GetBirthMonth();
	System.out.println(strMonth);
	objSignUpPage.selectMonth(strMonth);
	
	String strYear=objUtilities.getBirthYear();
	objSignUpPage.selectYear(strYear);
	
	String strGender=objUtilities.getGender();
	System.out.println(strGender);
	objSignUpPage.selectGender(strGender);
	}
	
	

}
