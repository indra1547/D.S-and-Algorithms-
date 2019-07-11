package com.indra.CodingPatterns.BinarySearch;
/*
 * Given an array of numbers sorted in ascending order, find the range of a 
 * given number ‘key’. The range of the ‘key’ will be the first and last 
 * position of the ‘key’ in the array.

Write a function to return the range of the ‘key’. If the ‘key’ is not present
return [-1, -1].
**/

import java.util.Arrays;

public class NumberRange {
	public int[] rangeOfNumbers(int[] nums, int key) {
		int[] res = new int[] { -1, -1 };
		res[0] = search(nums, key, true);
		if (res[0] != -1) {
			res[1] = search(nums, key, false);
		}
		return res;

	}

	private int search(int[] nums, int key, boolean isFirstOccurence) {
		int keyIndex = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (key < nums[mid]) {
				end = mid - 1;
			} else if (key > nums[mid]) {
				start = mid + 1;
			} else { // if key == mid
				keyIndex = mid;
				if (isFirstOccurence) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return keyIndex;
	}

	public static void main(String[] args) {
		NumberRange obj = new NumberRange();
		int[] res = obj.rangeOfNumbers(new int[] { 4, 6, 6, 6, 9 }, 6);
		int[] res1 = obj.rangeOfNumbers(new int[] { 1, 3, 8, 10, 15 }, 10);
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(res1));
	}

}
