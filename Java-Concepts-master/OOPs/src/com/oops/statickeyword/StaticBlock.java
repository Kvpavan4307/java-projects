package com.oops.statickeyword;

public class StaticBlock {
	//this is static block
	//static block is used to initialise static member
	// Native methods creates inside static block
	static {
		System.out.println("Hello");
	}
	//can we make multiple static block
	// yes we can and run top to bottom 
	static {
		System.out.println("I am in second static method");
	}
	
	
	
	public static void main(String[] args) {
		
		StaticBlock sb = new StaticBlock();
		// how to call static method
		// when class is loaded into the memory static block run first.
		//printing hello after 1.6 version of java we need to make main method to run static block
		System.out.println("I am in main method");
		
		
			
	}

}
