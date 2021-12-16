package Apputil;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class utilities {
@BeforeTest
	public void logIn()
	{
		System.out.println("G-Mail Login");
	}
	@AfterTest
	
	public void logOut()
	{
		System.out.println("G-Mail LogOut");
	}
	
	@BeforeSuite
	
	public static void launchApplication()
	{
		System.out.println("Launch G-Mail Apllication");
	}
	@AfterSuite
	public static void closeApplication()
	{
		System.out.println("Close G-Mail Apllication");
	}
}
