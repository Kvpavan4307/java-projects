package com.oops.inheritance.single;

//Dog is a Animal (Is A relationship)
public class Dog  extends Animal{ //child class, sub class
	int dogAge;
	 void eat() {
	        System.out.println("Dog is eating");
	    }

	    void bark() {
	        System.out.println("Dog is barking");
	    }
//	    @Override
//	    void eatAnimal() {
//	    	System.out.println("This is dog class eat animal method");
//	    }
}
