package Com.fbAssignment.sripts;

import Com.fbAssignment.pageFactory.SignUpPage;

public class SignUpTest {

	public static void main(String[] args) {
		SignUpPage objSignUpTest = new SignUpPage();
		objSignUpTest.verifySignUpPageIsDispyaed();
		objSignUpTest.setFirstName();
		objSignUpTest.setLastName();
		objSignUpTest.setMobileNumber();
		objSignUpTest.set_mailid();
		objSignUpTest.setBirth_Day();
		objSignUpTest.set_gender();
		objSignUpTest.male();
		objSignUpTest.female();
		objSignUpTest.verifySignUpPageButton();
	}

}
