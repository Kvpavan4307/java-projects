package com.oops.constructor;

public class Employee {
	String name;
	int empId;
	
	// User define No argument constructor
	public Employee(){
		System.out.println("This is employee Constructor");
	}
	
	// Parameterzized Constructor
	public Employee(String name,int empId) {
		this.name=name;
		this.empId=empId;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}



	public static void main(String[] args) {
		Employee e1= new Employee("garuav",107);
		Employee e2 = new Employee("deepak",101);
		
		System.out.println(e1);
		System.out.println(e2);
		
	
	}

}
