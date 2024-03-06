package com.oops.abstraction;
/** Points To remember making abstract class and method
 *  Abstract method : only declaration not implementation
 *  If we declare one abstract method in class so, that class always abstract 
 *   
 *   Abstract class : Partially implemented class we declare as abstract class like if any abstract method init
 *   For abstract classes we can't make object for that.
 *   
 *   Abstract class vs Abstract method 
 * 1. If class contain at least one abstract method so we make that class as abstract class
 * 2. Abstract class can contain zero abstract method in it.
 * 3. Child class is responsible to implement the abstract class abstract method implementation.
 * 
 * 
 */
public class Main {
	public static void main(String args[]) {
		Car car = new Car();
		car.start();
		
		
		Vehicle v = new Car();
		v.start();
		
		Scooter s = new Scooter();
		s.start();
		
		Vehicle scooter = new Scooter();
		scooter.start();
		
		
		Vehicle v1= new Scooter();
		v1.show();
	
		
	}

}
