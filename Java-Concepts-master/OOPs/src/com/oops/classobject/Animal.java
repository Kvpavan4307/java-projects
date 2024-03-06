package com.oops.classobject;

public class Animal {
	
	int age;
	String color;
	public void eat() {
		System.out.println("eating.....");
	}
	public void run() {
		System.out.println("running");
	}
	
	void details(int age,String color) {
		this.age=age;
		this.color=color;
		System.out.println("age: "+age+"\nColor: "+color);
	}
	

}
