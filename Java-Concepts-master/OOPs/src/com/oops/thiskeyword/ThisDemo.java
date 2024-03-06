package com.oops.thiskeyword;
/* This keyword Uses
 * 1. this keyword can be used to refer current class instance variable
 * 2. this keyword can be used to invoke current class method(implicitly)
 * 3. this() can we used to invoke the current class constructor
 * 4. this can be used to pass the argument in the method call.
 * 5. this can be used to pass as an argument in the constructor call
 * 6. this can be used to return the current class instance from the method.
 */

public class ThisDemo {
	int i;
	ThisDemo(){
		System.out.println("no args constructor");
	}
	ThisDemo(int x){
		this();
		System.out.println("parametrised constructor");
	}
	
	ThisDemo(ThisDemo td){
		System.out.println("thisdemo class constructor");
	}
	
	void m1(ThisDemo td) {
		System.out.println("i am in m1 method");
	}
	void m2() {
		m1(this);
	}
	
	void m3() {
	Test t = new Test(this);
	}
	ThisDemo m4() {
		return this;
	}
	void setvalue(int i) {
		this.i=i;
	}
	void getValue() {
		System.out.println(i);
	}
	void display() {
		System.out.println("Hello");
	}
	void show() {
		this.display(); //display(); 
	}
}
