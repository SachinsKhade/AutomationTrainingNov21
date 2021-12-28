package com.flow;

import java.util.Hashtable;
import org.openqa.selenium.WebDriver;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;

public class MyAccoutFlow {

	private LoginPage objLoginPage;
	private static WebDriver driver = null;
	private BaseTest objBaseTest;

	public MyAccoutFlow(BaseTest basetest) {
		this.objBaseTest = basetest;
		objLoginPage = new LoginPage(objBaseTest);

	}

}
