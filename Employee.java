package com.vst.polymorphism;

public class Employee {

	int emp_id;
	String name;
	static String Department;
	float fee;
	private float salary;

	Employee(int emp_id, String name, String Department) {
		this.emp_id = emp_id;
		this.name = name;
		this.Department = Department;
	}

	Employee(int emp_id, String name, String course, float salary) {
		this(emp_id, name, Department);// reusing constructor
		this.salary = salary;
	}

	void display() {
		System.out.println(emp_id + " " + name + " " + Department + " " + salary);
	}
}
