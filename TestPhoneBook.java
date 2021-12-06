package com.vst.polymorphism;

public class TestPhoneBook {

	public static void main(String[] args) {
		PhoneBook objPhoneBook = new PhoneBook();
		PhoneUtilities objPhoneUtilities = new PhoneUtilities();
		String Name = objPhoneUtilities.getRandomStrings(6);
		String Mobile_number = objPhoneUtilities.getRandomMobile_Number() + objPhoneUtilities.getRandomMobile(7);
		// save with 1 number
		objPhoneBook.createContact(Name, Mobile_number);

		// save with 2 numbers
		String name = objPhoneUtilities.getRandomStrings(7);
		String Mobile_number1 = objPhoneUtilities.getRandomMobile_Number() + objPhoneUtilities.getRandomMobile(7);
		String Mobile_number2 = objPhoneUtilities.getRandomMobile_Number() + objPhoneUtilities.getRandomMobile(7);
		objPhoneBook.createContact(name, Mobile_number1, Mobile_number2);
	}

}
