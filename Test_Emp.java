package com.vst.polymorphism;

public class Test_Emp {

	public static void main(String args[]) {
		Employee ObjEmployee = new Employee(111, "ankit", "CS");
		Employee ObjEmployee_1= new Employee(112, "sumit", "CSS", 60000f);
		ObjEmployee.display();
		ObjEmployee_1.display();
	}
}
