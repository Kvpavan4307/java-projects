package com.oops.inheritance.hierarchical;

public class Main {
	public static void main(String[] args) {
		B b = new B();
		b.showA();
		b.showB();
	
		C c = new C();
		c.showA();
		c.showC();
		
		A ac= new C();
		ac.showA();
//		ac.showC();// not possible
		
		
		//syntax error
//		B bc = new C();
//		C ba = new A();
//	
	}

}
