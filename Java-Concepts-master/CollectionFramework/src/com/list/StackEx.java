package com.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//stack means LIFO 
//Stack extends Vector class
public class StackEx {

	public static void main(String[] args) {
		/**
		 * Stack all the vector method it uses and 
		 * some other methods like push() pop() additional methods added into it.
		 */
		Stack<Integer> al = new Stack<>();
		//Adding the element in Stack
		al.add(20);
		System.out.println(al);
		//pushing and poping the element into stack 
		al.push(30);
		System.out.println("After pushing the element"+al);
		al.pop();
		System.out.println("After poping the element"+al);
		//peek element
		System.out.println("peek element :"+al.peek());
		//size 
		System.out.println(al.size());
		//getting the element
		System.out.println(al.get(0));
		//or
		//remove 
		for(int i=0;i<al.size();i++) {
			System.out.println(al.remove(i));
		}
		
	
		System.out.println(al.size());
		//or for each loop
				for(int nums : al) {
					System.out.println(nums);
				}
				
		// adding element in pertiular place
			al.add(0, 20);
			System.out.println(al);
			
			// change the element of particular place
			al.set(0,50);
			System.out.println(al);
			
			Stack<Integer> arr = new Stack<>();
			arr.push(12);
			System.out.println(arr);

	}

}
