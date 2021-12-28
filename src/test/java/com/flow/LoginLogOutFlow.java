package com.flow;
import java.util.Hashtable;
import org.openqa.selenium.WebDriver;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;
public class LoginLogOutFlow {
	//reating reference object of loginpage
	private LoginPage objloginPage;
	private static WebDriver driver = null;
	private BaseTest objBaseTest;
	public Hashtable<String,String> objHashTable;
	private String testData="";
	public Hashtable<String,String> createUserCredentials()
	{
		objHashTable.put("Username", "maheshjawale4586@gmail.com");  
		objHashTable.put("Password", "9922034633");
		System.out.println(" HashTable test Data"+objHashTable.toString());
		return objHashTable;
}
	public LoginLogOutFlow(BaseTest basetest) {
		this.objBaseTest = basetest;
		objloginPage = new LoginPage(objBaseTest);
		objHashTable =new Hashtable<String,String>();
		this.createUserCredentials();
	}
	public void doLogin()
	{  testData = objHashTable.get("Username");
	if(!testData.equals(""))
		objloginPage.setUserNameOnLoginPage(testData);
	testData = objHashTable.get("Password");
	if(!testData.equals(""))
		objloginPage.setPassWordOnLoginPage(testData);
		objloginPage.ClickSignInOnLoginPage();
		
	}
	public  void scroldata()
	{
		objBaseTest.getObjSeleniumWrapperFunctions().scrollDown();
	}
	
	
}
