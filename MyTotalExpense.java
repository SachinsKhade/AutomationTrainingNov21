package com.vst.array;

import java.io.*;

public class MyTotalExpense {

	public static void main(String[] args) throws IOException {
		int intExpense[] = new int[7];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your 7 Days Expence");
		for (int i = 0; i < 7; i++) {
			intExpense[i] = Integer.parseInt(br.readLine());

		}
		System.out.println("Given Day wise amount ");
		int intTotal = 0;
		for (int i = 0; i < 7; i++) {
			System.out.println(intExpense[i]);
			intTotal = intTotal + intExpense[i];
		}
		System.out.println("My Total weekly Expense is : " + intTotal + " Rs-Only");
	}
}
