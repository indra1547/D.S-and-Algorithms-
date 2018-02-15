package com.indra.java.Arrays;

/* A Sample Program to store 1 to 50 numbers in an Array 
 */
public class StoringArrayOfElements {
	public static void main(String[] args) {
		int[] arr = new int[51];
		for (int i = 1; i < 51; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}

	}

}
