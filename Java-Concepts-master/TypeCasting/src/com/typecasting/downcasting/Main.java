package com.typecasting.downcasting;

public class Main {

	public static void main(String[] args) {
		//upcasting 
		A obj = new B();
		obj.show1();

		
//		B obj2 = obj; // we cant do this
		// down casting
		B obj2 = (B) obj;
		obj2.show2();
		
		
	}

}
