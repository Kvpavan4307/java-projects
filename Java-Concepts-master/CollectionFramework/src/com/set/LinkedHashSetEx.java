package com.set;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;
// In linkedHashSet order always same
public class LinkedHashSetEx {

	public static void main(String[] args) {
		Set<Integer> hs = new LinkedHashSet<>();
		hs.add(12);
		hs.add(23);
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
