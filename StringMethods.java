package com.vst.str;

public class StringMethods {
	public void equalMethod(String title) {
		// TODO Auto-generated method stub
		String actual_title;
		actual_title = "Google";
		String expected_title = title;
		if (actual_title.equals(expected_title)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	}

	public void equalsIgnoreCase(String title) {
		String actual_title, expected_title;
		actual_title = "www.Google.com";
		expected_title = title;

		if (expected_title.equalsIgnoreCase(actual_title)) {
			System.out.println("Test Pass");
		} else {

			System.out.println("Test Faile");
		}
	}

	public void verifyContainMethod() {

		String expurl, acturl;
		expurl = "Gmail";
		acturl = "welcome to Gmail.com";

		if (acturl.toLowerCase().contains(expurl.toLowerCase())) {
			System.out.println("Tess Pass");
		} else {
			System.out.println("Test Fail");
		}
	}

	public  void length(String name) {
		// Declaring company name

		String company_Name = name;
				
		// finding length

		System.out.println(company_Name.length());
		
		

	}
	public static void split(String strBirthday) {
		
		String dayOfBirth = strBirthday;
				
		String[] x = dayOfBirth.split("/");
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);

	}
	

		public  void toLowerCase(String url) {
			String expurl, acturl;
			expurl =url;
			acturl = "welcome to Gmail.com";

			if (acturl.toLowerCase().contains(expurl.toLowerCase())) {
				System.out.println("Tess Pass");
			} else {
				System.out.println("Test Fail");
			}
		}


}
