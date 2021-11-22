package com.vst;

public class StaticVariable {
	// Declaring Static Variable
	static String strName = "Sachin";
	static int intAge = 25;
	static long longMobileNumber = 987654432;

	public static void main(String[] args) {
		// Accessing Static Variable inside Main Method

		// 1 Way By Creating Object to access Static Variable
		InstanceVariable objInstanceVariable = new InstanceVariable();
		System.out.println(objInstanceVariable.strName);
		System.out.println(objInstanceVariable.intAge);
		System.out.println(objInstanceVariable.longMobileNumber);
		// 2 Way Accessing Directly
		System.out.println(
				"--------------------------------------------------------------------------------------------");

		System.out.println(strName);
		System.out.println(intAge);
		System.out.println(longMobileNumber);
		// 3 Way Accessing By Class name
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println(StaticVariable.strName);
		System.out.println(StaticVariable.intAge);
		System.out.println(StaticVariable.longMobileNumber);
	}

}
