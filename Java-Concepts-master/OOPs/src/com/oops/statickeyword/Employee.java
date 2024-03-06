package com.oops.statickeyword;

public class Employee {
	int empId;
	String name;
//	String company;  // we can make it static because it is common for other details
	static String company="grow more";
	
	
	public Employee(int empId, String name) {
		
		this.empId = empId;
		this.name = name;
		
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", company=" + company + "]";
	}
	
}
