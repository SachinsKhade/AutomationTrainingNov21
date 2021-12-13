package com.abstaractio;

public class Employees implements Developer, Manager {

	@Override
	public void show() {
		System.out.println("Hello Good Morning code is done"); 
		
	}

	@Override
	public void disp() {
		System.out.println("Code Revies done ?");
		
	}

}
