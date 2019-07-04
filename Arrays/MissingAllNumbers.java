package com.indra.CodingPatterns.CyclicSort;
/*
 * We are given an unsorted array containing numbers taken from the range 1 
 * to ‘n’. The array can have duplicates, which means some numbers will be
 * missing. Find all those missing numbers.
	
Example 1:
Input: [2, 3, 1, 8, 2, 3, 5, 1]
Output: 4, 6, 7
Explanation: The array should have all numbers from 1 to 8, due to duplicates 
4, 6, and 7 are missing.
 * */

import java.util.ArrayList;
import java.util.List;

public class MissingAllNumbers {
	public List<Integer> missingAll(int[] nums) {
		List<Integer> missing = new ArrayList<Integer>();
		int i = 0;
		while (i < nums.length) {
			int j = nums[i] - 1;
			if (nums[i] != nums[j]) {
				swap(nums, i, j);
			} else {
				i++;
			}
		}
		for (int k = 0; k < nums.length; k++) {
			if (nums[k] != k + 1) {
				missing.add(k + 1);
			}
		}
		return missing;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		MissingAllNumbers obj = new MissingAllNumbers();
		System.out.println(obj.missingAll(new int[] { 2, 3, 1, 8, 2, 3, 5, 1 }));

	}

}
