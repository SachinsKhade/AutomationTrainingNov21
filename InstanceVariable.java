package com.vst;

public class InstanceVariable {
	// Declaring Instance Variable
	String strName = "Sachin";
	int intAge = 25;
	long longMobileNumber = 987654432;

	public static void main(String[] args) {
		// Accessing Non Static/ Instance Variable inside Main Method

		// Creating Object to access instance Variable
		InstanceVariable objInstanceVariable = new InstanceVariable();
		System.out.println(objInstanceVariable.strName);
		System.out.println(objInstanceVariable.intAge);
		System.out.println(objInstanceVariable.longMobileNumber);

	}

}
