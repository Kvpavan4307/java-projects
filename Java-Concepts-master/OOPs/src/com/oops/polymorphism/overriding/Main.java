package com.oops.polymorphism.overriding;

public class Main {
	public static void main(String args[]) {
		// overriding / runtime polymorphism 
		Test t = new Test();
		t.show(null);
		
		Test2  test = new Test2();
		test.show(null);
//		
		Test tt = new Test2();
//		tt.show(null);
//		tt.show(null);
		tt.m1();
//		tt.a1();  // not possible
		
		
		
		
		/* Method Overriding Points 
		 * case1 : from java 5.0 onwards it is possible to have different
		 * return type for a overriding methods in child class, but child's
		 * return type should be sub-type of parent's return type.
		 * This phenomena is know as Covariant return type.
		 * 
		 * case 2: The access modifier for an overriding method can allow
		 * more, but not less, access than the overridden method.
		 * For example , a protected instance method in super class can be 
		 * made public, but not private in the subclass. Doing so, will
		 * generate compile time error
		 *
		 *
		 * final methods cann't override
		 * static methods can't override
		 * private methods can't override
		 * 
		 * */
		
	}
}
