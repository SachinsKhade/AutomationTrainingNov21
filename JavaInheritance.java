package com.vst.inheritance;

public class JavaInheritance {
	public void dologin(String strUserName, String strPassword) {
		// Step 1: Enter User Name
		System.out.println("Enter UserName" + strUserName);
		// Step 2:Enter PassWord
		System.out.println("Enter Password" + strPassword);
		// Step 3: Click on login Button
		System.out.println("Click on Login button");
		// Step 4: Verify login Or Not
		System.out.println("Verify Login");
	}

	public void dologout(String StrClick) {

		{
			// Step 1: Click on Logout Button
			System.out.println("Clicked on Logout button  " + StrClick);
			// Step 4: Verify logout Or Not
			System.out.println("Verify LogOut");
		}

	}
}
