package com.oops.superkeyword;

public class B extends A {
		int a=20;
		void m1() {
			System.out.println("class B m1 method");
		}
		B(){
			System.out.println("I am b class constructor");
		}
		void show(int a) {
		
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
			m1();
			super.m1();
			
		}
		
		
		
		
}	
