package com.demo;

public class Box<T>{
	//object class is top most parent class of all java class
	
	T container;
	
	public Box(T container) {
	this.container = container;
		
	}
	
	public T getValue() {
		return this.container;
	}
	
	public void performSomeTask() {
		if(container instanceof String) {
			System.out.println("length of string "+(((String) this.container).length()));
		}else if(container instanceof Integer) {
			System.out.println("value of Integer "+ container);
		}
	}
	

	

}
