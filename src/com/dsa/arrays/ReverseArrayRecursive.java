package com.dsa.arrays;

/*Recursive Way 
1) Initialize start and end indexes as start = 0, end = n-1 
2) Swap arr[start] with arr[end] 
3) Recursively call reverse for rest of the array.
Time Complexity = O(n)
*
*/

public class ReverseArrayRecursive {
	static void revArr(int arr[], int start, int end) {
		int temp;
		if(start >= end) 
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		revArr(arr,start+1,end-1);
		
		
		
	}
	
	static void printArr(int arr[],int size) {
		
		for(int i=0; i<size; i++) 
			System.out.println(arr[i]+" ");
		System.out.println("");
		
		
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		printArr(arr,6);
		revArr(arr,1,6);
		System.out.println("Reverse");
		printArr(arr,6);

	}

}
