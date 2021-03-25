package com.dsa.collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// HashSet : The HashSet class is an inherent implementation 
		//of the hash table data structure. The objects that we insert 
		//into the HashSet do not guarantee to be inserted in the same order. 
		//The objects are inserted based on their hashcode. 
		//This class also allows the insertion of NULL elements. 
		//Let’s understand HashSet 
		
		
		HashSet<String> hash = new HashSet<String>();
		
		hash.add("Ashwini");
		hash.add("This");
		hash.add("program");
		hash.add("demonstrates");
		hash.add("hashset");
		hash.add("By ");
		hash.add("Set Interface");

		Iterator<String> itr = hash.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
