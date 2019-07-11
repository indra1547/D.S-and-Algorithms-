package com.indra.CodingPatterns.BinarySearch;
/*
 * Given an array of numbers sorted in ascending order, find the element in 
 * the array that has the minimum difference with the given ‘key’.
 * 
 * Input: [4, 6, 10], key = 7
   Output: 6
   Explanation: The difference between the key '7' and '6' is minimum than any
   other number in the array 
 * */

public class MinDifferenceElement {
	public int minDiff(int[] arr, int key) {
		if (key < arr[0]) {
			return arr[0];
		}
		if (key > arr[arr.length - 1]) {
			return arr[arr.length - 1];
		}
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < key) {
				start = mid + 1;
			} else if (arr[mid] > key) {
				end = mid - 1;
			} else {
				return arr[mid];
			}
		}
		// after reach end of loop i.e start = end + 1
		if ((arr[start] - key) < (arr[end] - key)) {
			return arr[start];
		}
		return arr[end];
	}

	public static void main(String[] args) {
		MinDifferenceElement obj = new MinDifferenceElement();
		System.out.println(obj.minDiff(new int[] { 4, 6, 10 }, 7));
		System.out.println(obj.minDiff(new int[] { 4, 6, 10 }, 4));
		System.out.println(obj.minDiff(new int[] { 1, 3, 8, 10, 15 }, 12));
		System.out.println(obj.minDiff(new int[] { 4, 6, 13 }, 17));
	}

}
