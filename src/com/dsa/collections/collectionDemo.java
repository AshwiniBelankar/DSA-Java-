package com.dsa.collections;

import java.util.*;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable();
		
		//Adding Elements to Vectors 
		
		v.addElement(6);
		v.addElement(7);
		
		//Adding Elements to HashTable

		h.put(1, "Ashwini");
		h.put(2, "Mangesh");
		h.put(3, "Prathama");
		
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
	}

}
