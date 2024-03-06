package com.typecasting.example;

public class Ex {
	
	public static void main(String[] args) {
		// implicit -- up casting 
		char ch ='a';
		int v =ch;
		System.out.println(v);
		
		// down casting -- explicit 
		int a = 99;
		char c =(char)a;
		System.out.println(c);
		
	}

}

class Vehicle {
	
}


class car extends Vehicle{
	
}