package com.oops.polymorphism.overloading;
/** Overloading
 * Case 1: if not exact match automatic promotion
 * -- byte->short->int->long->float->double
 *                  ^
 *            	   char
 * 
 *  case 2: In overloading exact match get high priority
 *  
 *  
 *                                   
 */				
 
public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		//method overloading / compile time 
		t.show(10);
		t.show();
		t.show('a'); // automatic promotion
		t.show('A'); // automatic promotion
	
		

		
		
		
		
		
	}

}
