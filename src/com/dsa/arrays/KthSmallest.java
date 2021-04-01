package com.dsa.arrays;

import java.util.*;


public class KthSmallest {
	
	public static int kthsmallest(Integer[] arr, int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,23,12,34,24,35};
		int k=2;
		System.out.println("Kth Smallest element is "+kthsmallest(arr,k));

	}

}
