package com.indra.java.DataStructuresInJava.Arrays;

import java.util.Arrays;

/*
 * In this problem, you have to implement the void rotateArray(int[] arr) 
 * function which will pick the last index from the right and rotate it to the 
 * left. This means that the right-most element will appear at the left-most 
 * position in the array, and so on. However, in this problem, you only have
 * to rotate by one element from the right.
 * 
 *  arr = {1, 2, 3, 4, 5}
 *  arr = {5, 1, 2, 3, 4}
 *  
 * */

public class RightRotateArrayByOneIndex {
	public void rotateArray(int[] arr){
		int lastElement = arr[arr.length - 1];
		for(int i = arr.length - 1; i > 0; i--){
			arr[i] = arr[i-1];
		}
		arr[0] = lastElement;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		RightRotateArrayByOneIndex obj = new RightRotateArrayByOneIndex();
		obj.rotateArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
