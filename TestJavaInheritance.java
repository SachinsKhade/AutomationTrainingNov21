package com.vst.inheritance;
public class TestJavaInheritance extends JavaInheritance {
	public void verifyhomepageHeaderIsDisplayed() {
		// Step 1 : Verify Home Page is Displayed
		System.out.println("Home Page is Displayed ");
	}

	public void TCID_101_verifyHomePageIsDisplayed() {
		// Step 2:dologin
		this.dologin("Sachin", "Verve@1234");

	}
	public void TCID_102_verifyLogoutDisplayed() {
		// Step 2:dologout
		//this.dologin("Sachin", "Verve@1234");
		this.dologout("Yes");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJavaInheritance objTestJavaInheritance = new TestJavaInheritance();
		objTestJavaInheritance.TCID_101_verifyHomePageIsDisplayed();
		objTestJavaInheritance.TCID_102_verifyLogoutDisplayed();

	}

}
