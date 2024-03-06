package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;


//add element from the first and last 
//remove first and last places also
// Deque interface has extended from queue
// Deque interface implemented by ArrayDeque class 
// Deque have all the methods of Queue methods + own functions

public class DequeEx {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addLast(100);
		dq.add(20);
		dq.addFirst(40);
		dq.addLast(200);
		System.out.println(dq);
		System.out.println(dq.peek());
		System.out.println("remove "+dq.remove());
		System.out.println("remove from last "+dq.removeLast());
		System.out.println("remove from first "+dq.removeFirst());
	}
}
