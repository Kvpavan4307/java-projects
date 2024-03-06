package com.lambda;

@FunctionalInterface
public interface Printable {
	String print(String suffex);
	default void show() {
		System.out.println("hello");
	}
	

}
