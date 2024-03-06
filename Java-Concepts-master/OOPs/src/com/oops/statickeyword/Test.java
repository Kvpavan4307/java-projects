package com.oops.statickeyword;
/*why we make static variable?
 * If variable is same for the object or for the same class 
 * we declare as that variable as static it take separate memory for the class and share with all the methods easily.
 * This will help in memory management.
 * static variable occupy the memory in class are or method area.
 */
public class Test {
	// we can access static variable with class name directly.
	static int a=10;
	void m1() {
//		static int b=10;  // static variable can't be defined with local variable it shows compile time error if we made it.
		
	}
	
	static void display() {
		System.out.println("This is test class display method");
	}
}
