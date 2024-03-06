package com.oops.classobject;
/**
 * Class Point to Remember : 
 * Only one public class in the program and save the file with that public class name
 * Not more than one public class in the program
 * If there is no public class we can save the file name with any class name present
 */
/**
 * For class level modifiers are:
 * public, <default>, abstract , final , strictfp
 * for inner class level modifier are:
 * above 5 modifier + private, protected , static 
 * 
 * for class level : public modifier we can access anywhere but for default access we can't access outside the package.
 * 
 * 
 * 
 */
public class Main {
	public static void main(String args[]) {
		Animal dog = new Animal();
		dog.details(10, "white");
		dog.eat();
		Birds sp = new Birds();
		sp.fly();
	}
	
	
	
	

}
