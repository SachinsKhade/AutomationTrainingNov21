package com.vst.array;

public class MinMaxGeneric {
	static void minium(int Minimun_data[]) {
		int minimum = Minimun_data[0];
		for (int i = 1; i < Minimun_data.length; i++)
			if (minimum > Minimun_data[i])
				minimum = Minimun_data[i];

		System.out.println("The Minimum Value present in this array is :" + minimum);
	}

	static void maximum(int Maximun_data[]) {
		int max = Maximun_data[0];
		for (int i = 1; i < Maximun_data.length; i++) {
			if (max < Maximun_data[i]) {
				max = Maximun_data[i];
			}

		}
		System.out.println("The Maximum Value present in this array is :" + max);
	}

}
