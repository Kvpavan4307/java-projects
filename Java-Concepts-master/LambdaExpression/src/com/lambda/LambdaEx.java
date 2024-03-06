package com.lambda;
/*
 * Interface only have one abstract method we call as functionalInterface
 * SAM-> single abstract method
 * Lambda your are only able to define the implementation of one method 
 * when the interface has only one abstract method it work fine
 * 
 */
public class LambdaEx {
	
	static void printThing(Printable thing) {
		thing.print("!");
	}
	
	public static void main(String[] args) {
		

		
		Printable lambdaPrintable = (s) -> "Meow " +s;
		printThing(lambdaPrintable);
		
		
	}
	
	

}
