package com.indra.CodingPatterns.BinarySearch;
/*
 * Given an array of numbers sorted in an ascending order, find the ceiling of
 * a given number ‘key’. The ceiling of the ‘key’ will be the smallest element
 * in the given array greater than or equal to the ‘key’.Write a function to 
 * return the index of the ceiling of the ‘key’. If there isn’t any ceiling 
 * return -1
 * 
 * Input: [4, 6, 10], key = 6
   Output: 1
   Explanation: The smallest number greater than or equal to '6' is '6' having 
   index
 * */

public class CeilingOfNumber {
	public int findCeilingNumber(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		if (key > arr[end]) {
			return -1;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (key == arr[mid]) {
				return mid;
			}
			if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		CeilingOfNumber obj = new CeilingOfNumber();
		System.out.println(obj.findCeilingNumber(new int[] { 4, 6, 10 }, 6));
		System.out.println(obj.findCeilingNumber(new int[] { 1, 3, 8, 10, 15 }, 12));
		System.out.println(obj.findCeilingNumber(new int[] { 4, 6, 10 }, 17));
		System.out.println(obj.findCeilingNumber(new int[] { 4, 6, 10 }, -1));
	}

}
