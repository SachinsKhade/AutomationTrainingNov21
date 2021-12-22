package com.collection;

import java.util.ArrayList;

public class AddingEmployeeData {


public static void main(String[] args) 
{ 
  Employee emp1 = new Employee(102, "Shubh", "Nagpur" ); 
  Employee emp2 = new Employee(205, "Anjali", "Dhanbad"); 
  Employee emp3 = new Employee(333, "Shanjna", "Mumbai"); 

  ArrayList<Employee> list = new ArrayList<Employee>(); 
   list.add(emp1); 
   list.add(emp2); 
   list.add(emp3); 
 Employee temp = new Employee(); 

// Call displayData method using temp reference variable object and pass list as a parameter. 
   temp.displayData(list); 
  } 
}
