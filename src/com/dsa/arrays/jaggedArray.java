//A jagged array is an array of arrays such that member arrays can be 
//of different sizes, i.e., we can create a 2-D array but with 
//a variable number of columns in each row. These types of arrays are
//also known as Jagged arrays. 


package com.dsa.arrays;

public class jaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare array
		int arr[][]= new int[2][];
		
		//making above array jagged
		//first row has 3 colomns
		
		arr[0] = new int[3];
		
		//second row has 2 columns
		
		arr[1] = new int[2];
		
		//initializing array
		
		int count = 0;
		for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
 
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

	}

}
