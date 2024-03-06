package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// all element in treeset is sorted 

public class TreeSetEx {
	public static void main(String[] args) {
		Set<Integer> hs = new TreeSet<>();
		hs.add(23);
		hs.add(12);
		hs.add(24);
		hs.add(24); // no duplicate element present in set
		System.out.println(hs);
		System.out.println("size of element"+hs.size());
		for(int i:hs) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------------");
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		hs.remove(24);
		System.out.println(hs);
		
	}
}
