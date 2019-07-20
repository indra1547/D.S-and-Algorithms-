package com.indra.CodingPatterns.Subsets;

import java.util.*;

/*
 * Given a set with distinct elements, find all of its distinct subsets.
 * Input: [1, 3]
   Output: [], [1], [3], [1,3]
 * */

public class FindDistinctSubsets {
	private static List<List<Integer>> subsets(int nums[]) {
		List<List<Integer>> subsets = new ArrayList<>();
		subsets.add(new ArrayList<>());
		//// we will take all existing subsets and insert the current number
		// in them to create new subsets
		for (int currentNumber : nums) {
			int n = subsets.size();
			for (int i = 0; i < n; i++) {
				// create a new subset from the existing subset and insert the
				// current element to it
				List<Integer> set = new ArrayList<>(subsets.get(i));
				set.add(currentNumber);
				subsets.add(set);
			}
		}
		return subsets;
	}

	public static void main(String[] args) {
		List<List<Integer>> result = FindDistinctSubsets.subsets(new int[] { 1, 5, 3 });
		System.out.println("Here is the list of subsets: " + result);
	}

}
