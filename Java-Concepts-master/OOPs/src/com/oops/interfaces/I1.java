package com.oops.interfaces;

interface I1 {
	public static final int a=10;
	public abstract void show();
	public void show2();
	default void display() {
		System.out.println("Display method in interface");
	}
	static void run() {
		System.out.println("Run method in interface");
	}
	
}
