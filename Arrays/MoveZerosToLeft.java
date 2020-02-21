package com.indra.ads.arrays;

import java.util.Arrays;

/*
 * Given an integer array, move all elements that are 0 to the left while 
 * maintaining the order of other elements in the array. The array has to be
 *  modified in-place.
 *  
 *  run time complexity : O(n)
 *  memory: O(1)
 *  
 * */

public class MoveZerosToLeft {
	
	public static void moveZeros(int[] arr){
		int readIndex = arr.length -1 ;
		int writeIndex = arr.length - 1;
		
		while(readIndex >= 0){
			if(arr[readIndex] != 0){ // non zero element
				arr[writeIndex] = arr[readIndex];
				writeIndex --;
			}
			readIndex --; // if element is zero skip it
		}
		
		while(writeIndex >= 0){
			arr[writeIndex] = 0;// fill remaining elements with zero.
			writeIndex--;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,10,20,0,59,63,0,88,0};
		MoveZerosToLeft.moveZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

}
