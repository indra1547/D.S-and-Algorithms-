package com.indra.CodingPatterns.BinarySearch;

/*Given a sorted array of numbers, find if a given number ‘key’ is present 
 * in the array. Though we know that the array is sorted, we don’t know if 
 * it’s sorted in ascending or descending order. You should assume that the 
 * array can have duplicates.Write a function to return the index of the ‘key’
 *  if it is present in the array, otherwise return -1.
 *  
 *  Input: [4, 6, 10], key = 10
    Output: 2
 *  
 *  */

public class OrderAgnosticBinarySearch {
	public int findKey(int[] arr, int key) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		boolean isAscendingOrder = arr[start] < arr[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (key == arr[mid]) {
				return mid;
			}
			if (isAscendingOrder) { // if list is in ascending order
				if (key < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else { // descending order
				if (key < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		OrderAgnosticBinarySearch obj = new OrderAgnosticBinarySearch();
		System.out.println(obj.findKey(new int[] { 4, 6, 10 }, 10));
	}

}
