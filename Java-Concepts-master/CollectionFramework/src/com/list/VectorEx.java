package com.list;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
				
				Vector<Integer> al = new Vector<>();
				//Adding the element in Vector
				al.add(10);
				al.add(20);
				
				System.out.println(al);
				//size 
				System.out.println(al.size());
				//getting the element
				System.out.println(al.get(1));
				//or
				for(int i=0;i<al.size();i++) {
					System.out.println(al.get(i));
				}
				
				//remove 
				al.remove(1);
				System.out.println(al.size());
				//or for each loop
						for(int nums : al) {
							System.out.println(nums);
						}
						
				// adding element in pertiular place
					al.add(1, 20);
					System.out.println(al);
					
					// change the element of particular place
					al.set(1,50);
					System.out.println(al);
					
					List<Integer> arr = new Vector<>();
					arr.add(12);
					System.out.println(arr);
		

	}

}
