package com.vst.array;

public class ArrayMinMax {

	public static void main(String[] args) {
		int[] numbers = new int[] { 10, 20, 5, 70, 4 };
		for (int elements : numbers) {
			System.out.println(elements);
		}

		// Minimum Elements of the Array
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}

		}
		System.out.println("Minumum Value is=" + min);
		// Maximum Elements Of The Array
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i])

			{
				max = numbers[i];
			}
		}
		System.out.println("Minumum Value is=" + max);
	}
}
