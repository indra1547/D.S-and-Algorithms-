package com.indra.CodingPatterns.CyclicSort;
/*We are given an unsorted array containing ‘n’ numbers taken from the range 1 to ‘n’. The array has some duplicates, find all the duplicate numbers without using any extra 
 * space.
 * Input: [3, 4, 4, 5, 5]
   Output: [4, 5]
 * */

import java.util.*;

public class FindAllDuplicates {
	public List<Integer> findAllDups(int[] nums) {
		List<Integer> dups = new ArrayList<Integer>();
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
				dups.add(nums[k]);
			}
		}

		return dups;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	public static void main(String[] args) {
		FindAllDuplicates obj = new FindAllDuplicates();
		System.out.println(obj.findAllDups(new int[] { 3, 4, 4, 5, 5 }));

	}

}
