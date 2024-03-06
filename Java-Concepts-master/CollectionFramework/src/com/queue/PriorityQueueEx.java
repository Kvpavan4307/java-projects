package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

// Priority queue class implements Queue interface
// Queue is FIFO concept
public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>(); // add element with priority 
		// like vip1 , vip2 ,vip3 
		// minimum priority queue by default
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(7);
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println(queue);
		int x=queue.remove();
		
		System.out.println("remove element is "+x);
		System.out.println("peek element: "+queue.peek());
		
		
		

	}

}
