package com.vst;

public class Test {

	public static void main(String[] args) {
		// Create object For Calculator Class
		Calculator objCalculator = new Calculator();
		objCalculator.doAddition();

		// Create Object for Calculator_1 Class

		Calculator_1 objCalculator_1 = new Calculator_1();
		objCalculator_1.doAddition(12, 12);

		// Create Object for Calculator_2 Class

		Calculator_2 objCalculator_2 = new Calculator_2();

		int intTotal = objCalculator_2.doAddition(45, 12);
		System.out.println("doAddition Method is returning :" + intTotal);
		

		String strNumber = "245";
		int intNumb = Integer.parseInt(strNumber);
		int intReturn = objCalculator_2.doAddition(intNumb, 232);
		System.out.println("New Addition is :"+intReturn);
		
	}

}
