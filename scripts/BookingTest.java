package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.PageFactory.BookingPage;
import com.generic.BaseTests;
import com.generic.BaseTests;
import com.generic.utility;

public class BookingTest extends BaseTests {
	static WebDriver driver = null;

	public void beforeMainMethod() {
		this.initializedWebEnvironment();
		BookingPage objBookingPage = new BookingPage(this);
		objBookingPage.verifyClearTripPageIsDispyaed();
		utility objUtilities = new utility();

		String strCityName = objUtilities.getRandomFromCityName();
		objBookingPage.tripFrom(strCityName);
		
		String strTocityName = objUtilities.getRandomToCityName();
		objBookingPage.toTrip(strTocityName);
		
		String strAdult=objUtilities.getRandomAdult();
		objBookingPage.Adult(strAdult);
		
		
		String strChildren=objUtilities.getRandomChildren();
		objBookingPage.Children(strChildren);
		
		String strIntants=objUtilities.getRandomInfants();
		objBookingPage.infants(strIntants);
		

		


		
		
		
		// .setFirstName(strFirstNmae);
	}

	/*
	 * String strSurNmae =
	 * objUtilities.getRandomSurname()+objUtilities.getRandomStrings(4);
	 * objBookingPage.setSurname(strSurNmae);
	 * 
	 * String strMobile =
	 * objUtilities.getRandomMobile_Number()+objUtilities.getRandomMobile(7);
	 * objBookingPage.setMobileNumber(strMobile);
	 * 
	 * String strPasswaord=objUtilities.getRandomPassword();
	 * objBookingPage.setPasswaord(strPasswaord);
	 * 
	 * //String strDay=objSignUpPage.selectDay(7)+objUtilities.getRandomDay();
	 * String strday=objUtilities.getRandomDay();
	 * objBookingPage.selectDay(strday);
	 * 
	 * //String strMonth=objUtilities.getRandomMonths();
	 * //objSignUpPage.selectMonth(strMonth); String
	 * strMonth=objUtilities.GetBirthMonth(); System.out.println(strMonth);
	 * objBookingPage.selectMonth(strMonth);
	 * 
	 * String strYear=objUtilities.getBirthYear();
	 * objBookingPage.selectYear(strYear);
	 * 
	 * String strGender=objUtilities.getGender(); System.out.println(strGender);
	 * objBookingPage.selectGender(strGender); }
	 */
	public void afterMethod() {
		this.tearDown();

	}

	public static void main(String[] args) {

		utility objUtilities = new utility();
		BookingTest objBookingTest = new BookingTest();
		objBookingTest.beforeMainMethod();

		/*
		 * objSignUpPage.verifySignUpPageIsDispyaed(driver); String strFirstNmae
		 * = objUtilities.getRandomStrings(7);
		 * objSignUpPage.setFirstName(strFirstNmae,driver); String strSurNmae =
		 * objUtilities.getRandomSurname()+objUtilities.getRandomStrings(4);
		 * objSignUpPage.setSurname(strSurNmae,driver); String
		 * stremailid=objUtilities.getRandomStrings(4)+objUtilities.
		 * getRandomEmaiId(); objSignUpPage.setEmailID(stremailid);
		 * 
		 * 
		 * String srrmobile=objUtilities.getRandomMobile_Number()+objUtilities.
		 * getRandomMobile(7); objSignUpPage.setMobileNumber(srrmobile,driver);
		 * String strPassword = objUtilities.getRandomPassword();
		 * objSignUpPage.setPasswaord(strPassword,driver);
		 * 
		 * int strDay = Utilities.getRandomDay();
		 * objSignUpPage.selectDay(strDay);
		 * 
		 * String strMonth = objUtilities.getRandomMonths();
		 * objSignUpPage.selectMonth(strMonth);
		 * 
		 * // -----------------------------------
		 * 
		 * int strYear = Utilities.getRandomYear();
		 * objSignUpPage.selectYear(strYear);
		 * 
		 * // -----------------------------------
		 * 
		 * String strGender = objUtilities.getRandomGender();
		 * objSignUpPage.selectGender(strGender);
		 * 
		 * objSignUpPage.verifySignUpButton(); //objBaseTest.tearDown();
		 * 
		 */
	}

}
