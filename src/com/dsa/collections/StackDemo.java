package com.dsa.collections;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> s = new Stack<String>();
		s.push("Ashwini");
		s.push("Mangesh");
		s.push("Prathama");
		s.push("Vaishnavi");
		s.push("Shivangi");
		s.push("Tejal");
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.print("\n");
		
		s.pop();
		
		itr = s.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
