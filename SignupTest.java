package com.scripts;
import com.PageFactory.SignUpPage;
import com.generic.BaseTest;
import com.generic.Utilities;

public class SignupTest {

	public static void main(String[] args) {
	BaseTest objBaseTest = new BaseTest();
	Utilities objUtilities=new Utilities();
	SignUpPage objSignUpPage=new SignUpPage();
	objBaseTest.initializedWebEnvironment("https://www.facebook.com");
	objSignUpPage.verifySignUpPageIsDispyaed();
	String strFirstNmae=objUtilities.getRandomString();
	objSignUpPage.setFirstName(strFirstNmae);
	String strSurNmae=objUtilities.getRandomStringSurname();
	objSignUpPage.setSurname(strSurNmae);
	///---------------------------------------------------
	
	String strEmailidorMobileNumber=objUtilities.getRandomEmaiIdOrMobileNumber();
	
	objSignUpPage.setMobileNumberOrEmailID(strEmailidorMobileNumber);
	
	//-----------------------------------------
	
	String strPassword=objUtilities.getRandomPassword();
	objSignUpPage.setPasswaord(strPassword);
	
	//----------------------------------------------------
	
	
	int strDay=Utilities.getRandomDay();
	objSignUpPage.selectDay(strDay);
	
	//-----------------------------------
	
	String strMonth=objUtilities.getRandomMonths();
	objSignUpPage.selectMonth(strMonth);
	
	
	//-----------------------------------
	
	int strYear=Utilities.getRandomYear();
	objSignUpPage.selectYear(strYear);

	
	//-----------------------------------
	
	String strGender=objUtilities.getRandomGender();
	objSignUpPage.selectGender(strGender);
	
	objSignUpPage.verifySignUpButton();
	objBaseTest.tearDown();
	}

}
