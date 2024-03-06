package com.map;

import java.util.TreeMap;
import java.util.Map;
// In tree map order will be sorted
public class TreeMapEx {
public static void main(String[] args) {
	Map<String,Integer>  tm = new TreeMap<>();
	// adding element in TreeMap
	tm.put("Oranges",2);
	tm.put("Apples",5);
	tm.put("Lichi", 10);
	tm.put("Guava", 7);
	
	//Size of TreeMap
	System.out.println(tm.size());
	
	System.out.println(tm);
	
	// get the value by key
	System.out.println("Apple value is "+tm.get("Apples"));
	//again put the value of apples
	tm.put("Apples",10);
	System.out.println("Apple value is "+tm.get("Apples"));
	//if key is not present it will give null
	System.out.println("Mangoes value is "+tm.get("Mangoes"));
	// check the key is present or not 
	boolean ans=tm.containsKey("Mangoes");
	System.out.println("Mango present "+ans);
	int x=1;
	if(tm.containsKey("Mangoes")) {
		x=tm.get("Mangoes");
	}
	//remove element from TreeMap
	tm.remove("Apples");
	System.out.println(tm);
}
}
