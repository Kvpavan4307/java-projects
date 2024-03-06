package com.oops.thiskeyword;

public class Test {
	int i;
//	void setValue(int x) {
//		i=x;
//	}
	//this keyword is used to refer current class instance variable
	void setValue(int i) {
		this.i=i;
	}
	void show() {
		System.out.println(i);
	}
	Test(){
		
	}
	Test(ThisDemo td){
		System.out.println("Test class constructor");
	}
	/* This keyword Uses
	 * 1. this keyword can be used to refer current class instance variable
	 * 2. this keyword can be used to invoke current class method(implicitly)
	 * 3. this() can we used to invoke the current class constructor
	 * 4. this can be used to pass the argument in the method call.
	 * 5. this can be used to pass as an argument in the constructor call
	 * 6. this can be used to return the current class instance from the method.
	 */

}
