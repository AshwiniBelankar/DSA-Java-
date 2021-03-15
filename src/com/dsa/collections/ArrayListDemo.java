package com.dsa.collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer> ();
		
		//Appending elements into ArrayList
		for(int i=1; i<=5; i++) {
			arr.add(i);
		}
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
		
		//printing elements one by one
		for(int j=0; j < arr.size(); j++) {
			System.out.print(arr.get(j)+ " ");
		}

	}

}
