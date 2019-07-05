package com.indra.CodingPatterns.CyclicSort;
/*
 * We are given an unsorted array containing ‘n+1’ numbers taken from the range 1 to ‘n’. The array has only one duplicate but it can be repeated multiple times. Find that duplicate number without using any extra space. You are, however, allowed to modify the 
 * input array.
 * 
 * Input: [1, 4, 4, 3, 2]
   Output: 4
 * */

public class DuplicateNumber {
	public int findDuplicates(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int j = nums[i] - 1;
			if (i != j) {
				if (nums[i] != nums[j]) {
					swap(nums, i, j);
				} else {
					return nums[i];
				}
			} else {
				i++;
			}
		}
		return -1;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	public static void main(String[] args) {
		System.out.println(new DuplicateNumber().findDuplicates(new int[] { 4, 4, 1, 4, 4 }));

	}

}
