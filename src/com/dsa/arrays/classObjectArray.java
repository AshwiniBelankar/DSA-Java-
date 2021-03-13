package com.dsa.arrays;

public class classObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[3];
		byte bytearray[] = new byte[5];
		short shortsarray[] = new short[3];
		
		String[] strArray = new String[3];
		
		System.out.println(intArray.getClass());
		System.out.println(intArray.getClass().getSuperclass());
		System.out.println(bytearray.getClass());
		System.out.println(shortsarray.getClass());
		System.out.println(strArray.getClass());

	}

}
