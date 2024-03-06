package com.oops.encapsulation;
/**
 * Data hiding: 
 * Private double balance;  // using private and give getter setter for that 
 * advantage is security 
 * 
 * Encapsulation -> DataHiding + Abstraction
 */
public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Raj");
		System.out.println(emp);
	}
}
