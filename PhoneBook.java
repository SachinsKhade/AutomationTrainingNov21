package com.vst.polymorphism;

public class PhoneBook {

	void createContact(String name, String mobile_number, String mobile_number2) {
		// Step 1: Enter Name
		System.out.println("Enter Name: " + name);
		// Step 2: Enter First Number
		System.out.println("Enter First Number: " + mobile_number);
		// Step 3: Enter First Number
		System.out.println("Enter second Number: " + mobile_number2);
		// Step 4: Click on save Button
		System.out.println("Clicked Save Button");
		System.out.println("==================================================================");
	}

	void createContact(String name, String mobile_number) {
		// Step 1: Enter Name
		System.out.println("Enter Name: " + name);
		// Step 2: Enter First Number
		System.out.println("Enter First Number: " + mobile_number);

		// Step 3: Click on save Button
		System.out.println("Clicked Save Button");

		System.out.println("==================================================================");
	}
}
