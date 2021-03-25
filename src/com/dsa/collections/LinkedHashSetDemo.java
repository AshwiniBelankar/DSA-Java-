package com.dsa.collections;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// LinkedHashSet: A LinkedHashSet is very similar to a HashSet. 
		//The difference is that this uses a doubly linked list to store the data 
		//and retains the ordering of the elements.
		
		LinkedHashSet<String> lhash = new LinkedHashSet<String>();
		lhash.add("Ashwini");
		lhash.add("linkedHashset");
		lhash.add("very");
		lhash.add("Useful");
		lhash.add("Ashwini");//It wont print because set don't print duplicate
		
		Iterator<String> itr = lhash.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
