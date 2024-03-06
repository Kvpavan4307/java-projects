package com.exception;

public class Example {

	public static void main(String[] args) {
		try {
			int b[]= {2,4,6,5,6,6};
			b[12]=23;
			int a=50/0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hi print");

	}

}
