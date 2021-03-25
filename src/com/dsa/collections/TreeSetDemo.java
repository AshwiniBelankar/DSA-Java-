package com.dsa.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		/*TreeSet: The TreeSet class uses a Tree for storage. 
		 * The ordering of the elements is maintained by a set using their 
		 * natural ordering whether or not an explicit comparator 
		 * is provided. This must be consistent with equals if it is 
		 * to correctly implement the Set interface. 
		 * It can also be ordered by a Comparator provided at set creation 
		 * time, depending on which constructor is used.*/
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("I");
		ts.add("am");
		ts.add("Student");
		ts.add("of");
		ts.add("Computer");
		ts.add("Science");
		ts.add("Engineering");
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
