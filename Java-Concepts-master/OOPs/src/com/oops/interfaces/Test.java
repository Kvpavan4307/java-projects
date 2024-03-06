package com.oops.interfaces;



public class Test  implements I1,I2{
	@Override
	public void show() {
		System.out.println("This is show method");
		
	}
	public void show2() {
		System.out.println("This is show2 method");
	}
	
	@Override
	public void display() {
		System.out.println("Test display method");
	}
	public void m1() {
		System.out.println("m1 method");
	}
@Override
	public void show1() {
		System.out.println("show1 method");
		
	}

	
	static void run() {
		System.out.println("overriden run method");
	}

}
