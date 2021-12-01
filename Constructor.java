package com.oops.cont;

public class Constructor {
	
		int a = 0;
		int b = 0;
		double c = 0;

Constructor() // First Constructor
		{
			int a = 10;
			int b = 20;
			double c = 20.5;
		}

Constructor(int x, int y) // Second Constructor
		{
			a = x;
			b = y;

		}

Constructor(int x, double y)// Third Constructor
		{
			a = x;
			c = y;

		}

Constructor(int x, int y, double z) // Fourth Constructor
		{
			a = x;
			b = y;
			c = z;

		}

void Display() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	
	}

