package com.vst.polymorphism;

public class Cars extends Vehicle{
	String Vehicle_name = "Bike";

	public void show_Vehicle_name() {
		System.out.println("Nissan Bike");
		System.out.println("Hyundai Bike");
		System.out.println("Tata Bike");
		System.out.println("Hyundai Bike");

}
	
	public void show_Vehicle() {
		super.show_Vehicle_name();
	}	
}
