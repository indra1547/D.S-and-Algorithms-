package com.indra.Java.CodingPatterns.TwoPointer;
/*
 * Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new 
 * length of the array.
 * 
 * Input: [c], Key=3
   Output: 4
   Explanation: The first four elements after removing every 'Key' will be [2, 6, 10, 9].
 * */

public class RemoveDuplicatesInUnsortedArray {
	public int removeByKey(int[] arr, int key) {
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != key) {
				arr[counter] = arr[i];
				counter++;
			}
		}
		return counter;
	}
	

	public static void main(String[] args) {
		RemoveDuplicatesInUnsortedArray obj = new RemoveDuplicatesInUnsortedArray();
		System.out.println(obj.removeByKey(new int[] {3, 2, 3, 6, 3, 10, 9, 3}, 3));
	}

}
