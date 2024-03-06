package com.demo;

public class MainEx {
	public static void main(String[] args) {
//		Box box = new Box("this is object type");
//		box.container=22;
//		System.out.println(box.getValue());
		
		Box<String> box = new Box<>("this is string box");
		System.out.println(box.getValue());
		System.out.println(box.container.getClass().getName());
		
		Box<String> box1 = new Box<>("Box1 object");
		System.out.println(box1.getValue());
		System.out.println(box1.container.getClass().getName());
		box1.performSomeTask();
		
	}
}
