package com.demo;

import java.util.ArrayList;
import java.util.List;
// Generic Concept
public class Demo {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();	 // It is type safe only integer data type is added into the class
		l.add(23);
		
		List anotherList = new ArrayList<>(); // it is not type safe we can add any data type to the list
		anotherList.add(12);
		anotherList.add("gaurav");
		
		System.out.println(l);
		System.out.println(anotherList);
	 
	}
}
