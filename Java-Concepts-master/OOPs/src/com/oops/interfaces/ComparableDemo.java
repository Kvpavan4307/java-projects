package com.oops.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
class Product implements Comparable<Product>{
	String productId;
	double price;
	Product(){
		
	}
	Product(String n, double a){
		productId=n;
		price=a;
			
	}
	@Override
	public int compareTo(Product product) {
		if(this.price==product.price)
			return 0;
		else if(this.price>product.price) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

public class ComparableDemo {
public static void main(String[] args) {
//	List<Product> list= new ArrayList<Product>();
//	list.add(new Product("Shaggy",300.00));
//	list.add(new Product("Lacy",255.00));
//	list.add(new Product("Roger",100.00));
//	list.add(new Product("Tommy",450.00));
//	list.add(new Product("Tammy",175.00));
//	Collections.sort(list);
//	System.out.println();
//	for(Product product:list) {
//		System.out.println(product.productId+":"+product.price+", ");
//	}
//	
//	
	
//	int a =10;
//	int b=20;
//	int c=30;
//	System.out.println(a++>10|| ++b<=21);
//	System.out.println(a>10 && ++b<=22);
//	System.out.println(a<=11&& b==22);
//	System.out.println(c++==31&&a++==11|| b++==22);
	
	
//	String word1="Willow", word2="0w";
//	System.out.println(word1=="Willow");
//	System.out.println(word1==("Will"+"ow"));
//	System.out.println(word1==("Will"+word2));
	
//	LinkedList<Object> list = new LinkedList<Object>();
//	list.add("Java");
//	list.add(20);
//	list.add(3.5);
//	list.add(100);
//	if(list.set(0, "Data Structures")) {
//		System.out.println("Successfully replaced!");
//	}
//	else {
//		System.out.println("Not replaced!");
//	}
	
}
}
