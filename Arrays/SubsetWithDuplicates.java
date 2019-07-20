package com.indra.CodingPatterns.Subsets;

import java.util.*;
/*
 * Given a set of numbers that might contain duplicates, find all of its 
 * distinct subsets.
 * 
 * Input: [1, 3, 3]
   Output: [], [1], [3], [1,3], [3,3], [1,3,3]
 * */

public class SubsetWithDuplicates {
	public List<List<Integer>> subsetWithDups(int[] nums) {
		// sorting number to make repetitive number sit adjacent
		Arrays.sort(nums);
		List<List<Integer>> subsets = new ArrayList<>();
		subsets.add(new ArrayList<>());
		int startIndex = 0;
		int endIndex = 0;
		// When duplicate element arrives, instead of adding it to all subsets
		// we will add to it the previous subset.
		for(int i = 0; i< nums.length; i++){
			startIndex = 0;
			if(i> 0 &&nums[i] == nums[i-1]){
				startIndex = endIndex + 1;
			}
			endIndex = subsets.size() - 1;
			for(int j = startIndex; j <= endIndex; j++){
				List<Integer> set = new ArrayList<>(subsets.get(j));
				set.add(nums[i]);
				subsets.add(set);
			}
		}
		return subsets;
	}

	public static void main(String[] args) {
		SubsetWithDuplicates obj = new SubsetWithDuplicates();
		System.out.println(obj.subsetWithDups(new int[] { 1, 5, 3, 3 }));
	}

}
