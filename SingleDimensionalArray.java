package com.vst.array;

public class SingleDimensionalArray {
	// Adding 100 of value into Array
	public static void main(String[] args) {
		// Declared and instantiation array
		int intNumber[] = new int[100];
		// get array length using
		System.out.println("Length of Arry is : " + intNumber.length);

		// Adding Multiple Value into array

		for (int i = 0; i < intNumber.length; i++)
			intNumber[i] = i + 1;
		{
			// Accessing all array elements
			for (int i = 0; i < intNumber.length; i++)
				System.out.println(intNumber[i]);
			{

			}
		}

	}
}