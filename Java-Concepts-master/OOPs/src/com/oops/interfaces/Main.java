package com.oops.interfaces;
/** Interface : points to Remember
 *  Any Service Requirement specification
 *  Any contract b/w client and service provider is interface
 *  Every method of interface is abstract 
 *  100% pure abstract class but after 8 version it not follow 
 * 	we use implements to give implementation of interface class 
 *  
 *  
 * 
 */
public class Main {
	public static void main(String[] args) {
//		Test t = new Test();
//		t.display();
//		t.show();
//		Test.run();
//		
//		I1 i = new Test();
//		i.show();
//		i.display();
//				
//		I2 i2 = new Test();
//		i2.show1();	
		
		// I1.run();
		
		
		
		// example to understand interface
		
		Test t1 = new Test();
		t1.display();
		t1.m1();
		t1.show();
		t1.show1();
		t1.show2();
		
		Test.run();
		I1.run();
		
		I1 i1 = new Test(); // possible
		i1.display();
		i1.show();
		i1.show2();
		
		
		
		
	}
}
