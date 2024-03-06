package com.oops.inheritance.multilevel;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		c.showC();
		c.showA();
		c.showB();
		
		A a = new C();
		a.showA();
		
		
		B b=new C();
		b.showA();
		b.showB();
		
		A ab = new B();
		ab.showA();
		
		//wrong syntax
//		C cb = new B();
//		B ab = new A();
		
		
		
	}

}
