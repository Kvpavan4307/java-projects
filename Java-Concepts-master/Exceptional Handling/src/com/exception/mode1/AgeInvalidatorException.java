package com.exception.mode1;

public class AgeInvalidatorException extends Exception{
	
	public AgeInvalidatorException() {
		System.out.println("under age");
	}
	
	public String toString() {
		return " the age is not fit for having vote";
		
	}

}
