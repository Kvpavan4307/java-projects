package com.map;

import java.util.HashMap;
import java.util.Map;

// No duplicate element present in hashmap
// Hashmap is key value pair and v v imp
// data is stored in any order

public class HashMapEx {

	public static void main(String[] args) {
		Map<String,Integer>  hm = new HashMap<>();
		// adding element in HashMap
		hm.put("Oranges",2);
		hm.put("Apples",5);
		hm.put("Lichi", 10);
		hm.put("Guava", 7);
		
		System.out.println(hm);
		//size of HashMap
		System.out.println(hm.size());
		
		// get the value by key
		System.out.println("Apple value is "+hm.get("Apples"));
		//again put the value of apples
		hm.put("Apples",10);
		System.out.println("Apple value is "+hm.get("Apples"));
		//if key is not present it will give null
		System.out.println("Mangoes value is "+hm.get("Mangoes"));
		// check the key is present or not 
		boolean ans=hm.containsKey("Mangoes");
		System.out.println("Mango present "+ans);
		int x=1;
		if(hm.containsKey("Mangoes")) {
			x=hm.get("Mangoes");
		}
		//remove element from hashmap
		hm.remove("Apples");
		System.out.println(hm);
	}

}
