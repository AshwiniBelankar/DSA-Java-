package com.dsa.collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		/*HashMap provides the basic implementation of the Map interface of 
		 * Java. It stores the data in (Key, Value) pairs. 
		 * To access a value in a HashMap, we must know its key. 
		 * HashMap uses a technique called Hashing. 
		 * Hashing is a technique of converting a large String to small 
		 * String that represents the same String so that the indexing and 
		 * search operations are faster. 
		 * HashSet also uses HashMap internally.*/
		
		HashMap<Integer,String> hm =  new HashMap<Integer, String>(); 
		
		hm.put(1, "Ashwini");
		hm.put(2, "Mangesh");
		hm.put(3, "Prathama");
		
		System.out.print("Value for 1 is " + hm.get(1)+"\n");
		
		//Traversing through key
		for(Map.Entry<Integer, String> e: hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
