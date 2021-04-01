package com.dsa.arrays;

/*Initialize values of min and max as minimum and maximum of 
 * the first two elements respectively. Starting from 3rd, compare each element with max 
 * and min, and change max and min accordingly (i.e., if the element is smaller than min then 
 * change min, 
 * else if the element is greater than max then change max, else ignore the element) */

public class MinMax {
	static class Pair{
		int min;
		int max;
	}
	
	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		int i;
		
		if(n==1) {
			minmax.max = arr[0];
			minmax.min = arr[1];
			return minmax;
		}
		
		if(arr[0]>arr[1]) {
			minmax.max = arr[0];
			minmax.min = arr[1];
		}else {
			minmax.min = arr[1];
			minmax.max = arr[0];
		}
		
		for(i=2; i < n; i++) {
			if(arr[i]>minmax.max) {
				minmax.max = arr[i];
			}else if(arr[i]<minmax.min) {
				minmax.min = arr[i];
			}
		}		
		return minmax;
	}
	public static void main(String[] args) {
		int arr[] = {1000,11,445,1,330,3000};
		int arr_size = 6;
		Pair minmax = getMinMax(arr,arr_size);
		System.out.printf("\n Minium %d",minmax.min);
		System.out.printf("\n Maximum %d", minmax.max);
		
		
		}

	}

