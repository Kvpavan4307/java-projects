package com.oops.statickeyword;

/*Rule for static method
 * 1. static methods belongs to the class, not to the object
 * 2. A static method can be accessed directly by class name and doesn't need any object
 * 3. A static method can access only static data. It cann't access non-static data (instance data)
 * 4. A static method can call only other static methods and cannot call a non-static method
 * 5. A static method can not refer to this or super keyword in anyway
 * 
 */




public class StaticDemo {
//	int a=10; 
	static int a=10;
	StaticDemo(){
		a++;
		System.out.println(a);
	
	}
	int i=10;
	//static method 
	static void display() {
		System.out.println("This is display method");
		// non static variable can't access in the static methods
//		System.out.println(i);
		// we can't access non static method inside static method
//		show();
		
		// we can't access this and super keyword
//		this.i=10;
//		super();
		
	}
	
	void show() {
		
		System.out.println(this.i);
	}
	
	public static void main(String[] args) {
			StaticDemo sd1 =new StaticDemo();
			StaticDemo sd2 = new StaticDemo();
			StaticDemo sd3 = new StaticDemo();
			// static method also use for memory management
			display(); // calling of static methods
			Test.display();
			
			
			
			
	}	

}
