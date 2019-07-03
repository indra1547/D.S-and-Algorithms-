package com.indra.CodingPatterns.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
	public void sort(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int j = nums[i] - 1;
			if (nums[i] != nums[j]) {
				swap(nums, i, j);
			} else {
				i++;
			}
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		CyclicSort obj = new CyclicSort();
		int[] nums = { 3, 1, 5, 4, 2 };
		obj.sort(nums);
		System.out.println(Arrays.toString(nums));

	}

}
