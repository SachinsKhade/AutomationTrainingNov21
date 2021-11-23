package com.vst;

public class TypeCast {

	public void wideningTypeCastingExample() {
		byte byteNumber = 10;
		short shortNumber = byteNumber;
		int intNumber = shortNumber;
		long longNumber = intNumber;
		float floatNumber = longNumber;
		double doubleNumber = floatNumber;

		System.out.println("Before conversion, byte value " + byteNumber);
		System.out.println("After conversion, short value " + shortNumber);
		System.out.println("After conversion, int value " + intNumber);
		System.out.println("After conversion, long value " + longNumber);
		System.out.println("After conversion, float value " + floatNumber);
		System.out.println("After conversion, double value " + doubleNumber);
		System.out.println(
				"----------------------------------------------------------------------------------------------");
	}

	public void narrowingTypeCastingExample() {
		double doubleNumber = 166.66;
		// converting double data type into float data type
		float floatNumber = (float) doubleNumber;
		// converting double data type into float data type
		long longNumber = (long) floatNumber;
		// converting float data type into long data type
		int intNumber = (int) longNumber;
		// converting long data type into int data type
		short shortNumber = (short) longNumber;
		// converting int data type into short data type
		byte byteNumber = (byte) longNumber;
		// converting short data type into byte data type
		System.out.println("Before conversion, Double value " + doubleNumber);
		System.out.println("After conversion, Float value " + floatNumber);
		System.out.println("After conversion, long value " + longNumber);
		System.out.println("After conversion, int value " + intNumber);
		System.out.println("After conversion, short value " + shortNumber);
		System.out.println("After conversion, double value " + byteNumber);
		System.out.println(
				"--------------------------------------------------------------------------------------------");
	}

	public void otherConversion() {
		// string integer conversion
		// Declaring String variable
		String strNumber = "200";
		System.out.println("Before conversion, String value " + strNumber);
		// Converting String into int using Integer.parseInt()
		int intNumber = Integer.parseInt(strNumber);
		// Printing value of i
		System.out.println("After conversion, String value " + intNumber);
		System.out.println(
				"--------------------------------------------------------------------------------------------");

		// integer To String conversion

		int intNumber_1 = 200;
		String strName_1 = Integer.toString(intNumber_1);
		System.out.println(intNumber_1 + 100);// 300 because + is binary plus
												// operator
		System.out.println(strName_1 + 100);// 200100 because + is string
											// concatenation operator
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		// String to Long

		String strName_2 = "9990449935";
		System.out.println("Before conversion, String value " + strName_2);
		long longNumber_2 = Long.parseLong(strName_2);
		System.out.println("Before conversion, String value " + longNumber_2);
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		// String to Float
		String strName_3 = "23.6";
		float floatNumber = Float.parseFloat("23.6");
		System.out.println(floatNumber);
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		// Float to string
		float floatNumber_1 = 12.3F;// F is the suffix for float
		System.out.println("Before conversion, Float value "+floatNumber_1);
		String strName = String.valueOf(floatNumber_1);
		System.out.println(strName);
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		//char to String
		
		char charGrade='A';  
		String strName_4=String.valueOf(charGrade);  
		System.out.println("String is: "+strName_4);  
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		//  String to char
		
		String strWoord="hello";    
		for(int i=0; i<strWoord.length();i++){  
		        char charWord = strWoord.charAt(i);  
		        System.out.println("char at "+i+" index is: "+charWord);  
	}
	}
}
