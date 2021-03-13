package com.dsa.arrays;

public class cloningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int cloneArr[] = arr.clone();
		
		System.out.println(arr == cloneArr);//will return false
		//because deep copy is created for one dimensional array
		
		for(int i = 0; i < cloneArr.length; i++) {
			System.out.print(cloneArr[i]+" ");
		}
		

	}

}
