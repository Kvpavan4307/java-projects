package com.oops.inheritance.single;

public class Main {
	//disadvantage of Inheritance
	//	Tightly coupled

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eatAnimal();
		d.eat();
		d.bark();
		// when we create parent type reference variable and child class object only parent methods will call
		// we can't call any child class method.
		Animal dog = new Dog();
		dog.eatAnimal();
		
		//dog.bark();//compilation error
		
	// Child class can't store the object of parent class.
//		Dog dg = new Animal();
//		dg.eat();

	}

}
