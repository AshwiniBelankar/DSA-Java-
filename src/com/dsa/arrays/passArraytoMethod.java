package com.dsa.arrays;

public class passArraytoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 1, 2, 5, 4}; 
        
        // passing array to method m1 
        Addition(arr); 

	}
	
	public static void Addition(int[] arr)  
    { 
        // getting sum of array values 
        int add = 0; 
          
        for (int i = 0; i < arr.length; i++) 
            add+=arr[i]; 
          
        System.out.println("sum of array values : " + add); 
    } 

}
