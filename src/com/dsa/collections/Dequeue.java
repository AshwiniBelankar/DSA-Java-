package com.dsa.collections;

import java.util.*;

public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
		deq.add(11);
		deq.add(12);
		deq.add(13);
		deq.add(14);
		deq.add(15);
		deq.add(16);
		
		System.out.print(deq);
		
		
		
		deq.addFirst(234);
		deq.addLast(890);
		
		System.out.println(deq);
		deq.clear();
		System.out.println(deq);
		deq.add(13);
		deq.add(14);
		deq.add(15);
		deq.add(16);
		System.out.println(deq);

	}

}
