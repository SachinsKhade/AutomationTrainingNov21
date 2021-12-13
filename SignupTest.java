package com.scripts;
import org.openqa.selenium.WebDriver;
import com.PageFactory.SignUpPage;
import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.generic.Utilities;

public class SignupTest extends BaseTest{
	static WebDriver driver =null;
	public void beforeMainMethod()
	{
		this.initializedWebEnvironment();
		SignUpPage objSignUpPage = new SignUpPage(this);
		objSignUpPage.verifySignUpPageIsDispyaed();
		
		Utilities objUtilities = new Utilities();
		String strFirstNmae = objUtilities.getRandomFirstName()+objUtilities.getRandomStrings(4);
		objSignUpPage.setFirstName(strFirstNmae);
		
		String strSurNmae = objUtilities.getRandomSurname()+objUtilities.getRandomStrings(4);
		objSignUpPage.setSurname(strSurNmae);
		
		String strMobile = objUtilities.getRandomMobile_Number()+objUtilities.getRandomMobile(7);
		objSignUpPage.setMobileNumber(strMobile);
		
		String strPasswaord=objUtilities.getRandomPassword();
		objSignUpPage.setPasswaord(strPasswaord);
		
		//String strDay=objSignUpPage.selectDay(7)+objUtilities.getRandomDay();
		String strday=objUtilities.getRandomDay();
		objSignUpPage.selectDay(strday);
		
		String strMonth=objUtilities.getRandomMonths();
		objSignUpPage.selectMonth(strMonth);
		
		objSignUpPage.selectYear();
		String strGender=objUtilities.getRandomGender();
		objSignUpPage.selectGender(strGender);
	}
	public void afterMethod()
	{
		this.tearDown();
		
	}

	public static void main(String[] args) {
		
		Utilities objUtilities = new Utilities();
		
		SignupTest objSignupTest=new SignupTest();
		objSignupTest.beforeMainMethod();
		
		/*objSignUpPage.verifySignUpPageIsDispyaed(driver);
		String strFirstNmae = objUtilities.getRandomStrings(7);
		objSignUpPage.setFirstName(strFirstNmae,driver);
		String strSurNmae = objUtilities.getRandomSurname()+objUtilities.getRandomStrings(4);
		objSignUpPage.setSurname(strSurNmae,driver);
		String stremailid=objUtilities.getRandomStrings(4)+objUtilities.getRandomEmaiId();
		objSignUpPage.setEmailID(stremailid);
		
		
String srrmobile=objUtilities.getRandomMobile_Number()+objUtilities.getRandomMobile(7);
objSignUpPage.setMobileNumber(srrmobile,driver);
		String strPassword = objUtilities.getRandomPassword();
		objSignUpPage.setPasswaord(strPassword,driver);

		int strDay = Utilities.getRandomDay();
		objSignUpPage.selectDay(strDay);

		String strMonth = objUtilities.getRandomMonths();
		objSignUpPage.selectMonth(strMonth);

		// -----------------------------------

		int strYear = Utilities.getRandomYear();
		objSignUpPage.selectYear(strYear);

		// -----------------------------------

		String strGender = objUtilities.getRandomGender();
		objSignUpPage.selectGender(strGender);
		
		objSignUpPage.verifySignUpButton();
		//objBaseTest.tearDown();
		
		*/
	}
	
	

}
