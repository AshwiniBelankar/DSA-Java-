package com.dsa.collections;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i=1; i<=5; i++) {
			v.add(i);
		}
		
		System.out.print(v);
		v.remove(3);
		System.out.print("\n");
		System.out.print(v);
		System.out.print("\n");
		for(int i=0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}

	}

}
