package com.dsa.arrays;
import java.util.*;
/*Algorithm for reversing an array
Step 1. Initialize two arrays.
Step 2. Declare the scanner class for taking input.
Step 3. Take first array size from the user.
Step 4. Take the element of the array from the user.
Step 5. Initialise backwards loop for storing the last element of the array into the second array first element.
Step 7. Print reverse array
Step 8. Stop.*/

public class RevArrwithUser {

	public static void main(String[] args) {
		int j = 0;
		int arr[] = new int[40];
		int rev[] = new int[40];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		System.out.println("Enter Elements");
		for(int i=0; i<size; i++)
			arr[i]=sc.nextInt();
		//storing elements last element of array in the reverse array
		for(int i=size-1; i>=0; i--) {
			rev[j] = arr[i];
			j++;
		}
		
		System.out.println("the reverse array");
		for(int i=0; i<size; i++) {
			System.out.print(rev[i]+ " ");
		}
 
	}

}
