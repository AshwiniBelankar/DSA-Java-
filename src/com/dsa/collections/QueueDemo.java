package com.dsa.collections;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		//Priority Queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.add(12);
		pQueue.add(15);
		pQueue.add(23);
		pQueue.add(34);
		pQueue.add(19);
		pQueue.add(20);
		pQueue.add(25);
		
		//Printing the top element
		System.out.println(pQueue.peek());
		
		//Printing the top element and removing it from top
		System.out.println(pQueue.poll());

		System.out.println(pQueue.peek());
		
	}

}
