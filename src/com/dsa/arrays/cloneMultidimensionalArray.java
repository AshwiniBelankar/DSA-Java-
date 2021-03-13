package com.dsa.arrays;

public class cloneMultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{4,5,6}};
		int cloneArr[][] = arr.clone();
		System.out.println(arr==cloneArr);//return false
		//because it creates a shallow copy of 
		System.out.println(arr[0] == cloneArr[0]); 
        System.out.println(arr[1] == cloneArr[1]);
		

	}

}
