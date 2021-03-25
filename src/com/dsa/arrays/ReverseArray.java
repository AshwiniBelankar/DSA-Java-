package com.dsa.arrays;

import java.util.Scanner;

/*
Iterative Way
1) Initialize start and end indexes as start = 0, end = n-1 
2) In a loop, swap arr[start] with arr[end] and change start and end as follows : 
start = start +1, end = end – 1
Time Complexity = O(n)
*/

public class ReverseArray {
	static void reverseArray(int arr[], int start, int end) {
		int temp;
		
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	static void printArray(int arr[], int size) {
		for(int i=0; i<size; i++) 
			System.out.print(arr[i]+" ");
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		int arr[] = new int[40];
		System.out.println("Enter Elements");
		for(int i=0; i<size; i++)
			arr[i]=sc.nextInt();
		System.out.println("You Entered");
		printArray(arr,size);
		reverseArray(arr,0,size-1);
		System.out.println("Reversed Array is ");
		printArray(arr,size);

	}

}
