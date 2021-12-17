package com.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.generic.BaseTests;
public class BookingPage {
	
	private static WebDriver driver = null;
	private BaseTests objBaseTest;  
	public BookingPage(BaseTests basetests) {
		this.objBaseTest=basetests;
	}

	String actual_url = "https://www.cleartrip.com/";
	//Locators
	
	By loc_fromTrip=By.xpath("//div/h4[text()='From']/following-sibling::div//input");
	By loc_inpCity=By.xpath("//p[normalize-space()='Nagpur, IN - Dr. Babasaheb Ambedkar (NAG)']");
	
	By loc_ToTrip=By.xpath("//div/h4[text()='To']/following-sibling::div//input");
	
	By loc_inpToCity=(By.xpath("//p[normalize-space()='Pune, IN - Lohegaon (PNQ)']"));
	By loc_Password=(By.xpath("//div[@id='reg_form_box']//input[@type='password']"));
	By loc_Adult=(By.xpath("//div[@class='mb-4']//select[@class='bc-neutral-100 bg-transparent']"));
	
	
	By loc_Chilren=(By.xpath("//h4[contains(text(),'Children')]/following-sibling::select"));
	//(//select[@class='bc-neutral-100 bg-transparent'])[2]
	
	By loc_infants=(By.xpath("//div[5]//select[1]"));
	
	public void verifyClearTripPageIsDispyaed() {
		System.out.println("ClearTripPage Page is Displayed");
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void tripFrom(String str_cityName) {
		System.out.println("Enter City Name From you want to travel : ");
		
		objBaseTest.getObjSeleniumWrapperFunction().setText(loc_fromTrip, str_cityName);
		objBaseTest.getObjSeleniumWrapperFunction().click(loc_inpCity);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}
	
	
	public void toTrip(String str_cityName) {
		System.out.println("Enter City Name Where you want to travel : ");
		objBaseTest.getObjSeleniumWrapperFunction().setText(loc_ToTrip, str_cityName);
		objBaseTest.getObjSeleniumWrapperFunction().click(loc_inpToCity);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}


	

		public void Adult(String str_Adult_No)
		{
			System.out.println("Enter Adult numbers : ");
			objBaseTest.getObjSeleniumWrapperFunction().getElement(loc_Adult);
			objBaseTest.getObjSeleniumWrapperFunction().doSelectByDropDownIndex(loc_Adult, str_Adult_No);
			System.out.println(str_Adult_No);
			System.out.println("Test Script Pass");
			System.out.println("===================================================================");
			
	}

		public void Children(String str_Children)
		{
			System.out.println("Enter Children numbers : ");
			objBaseTest.getObjSeleniumWrapperFunction().getElement(loc_Chilren);
			objBaseTest.getObjSeleniumWrapperFunction().doSelectByDropDownIndex(loc_Chilren, str_Children);
			System.out.println(str_Children);
			System.out.println("Test Script Pass");
			System.out.println("===================================================================");
			
	}
		

		public void infants(String str_infants)
		{
			System.out.println("Enter Infants numbers : ");
			objBaseTest.getObjSeleniumWrapperFunction().getElement(loc_infants);
			objBaseTest.getObjSeleniumWrapperFunction().doSelectByDropDownIndex(loc_infants, str_infants);
			System.out.println(str_infants);
			System.out.println("Test Script Pass");
			System.out.println("===================================================================");
			
	}

}
