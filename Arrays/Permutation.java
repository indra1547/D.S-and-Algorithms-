package com.indra.CodingPatterns.Subsets;

import java.util.*;
/*
 * Given a set of distinct numbers, find all of its permutations.
 * Input: [1,3,5]
   Output: [1,3,5], [1,5,3], [3,1,5], [3,5,1], [5,1,3], [5,3,1]
   
   Solution: BFS approach
 * */

public class Permutation {
	public List<List<Integer>> findPermutations(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Queue<List<Integer>> permutations = new LinkedList<>();
		permutations.add(new ArrayList<>());
		/*
		 * We will take existing permutations and add current element to create
		 * new permutation.
		 */
		for (int currentNumber : nums) {
			int n = permutations.size();
			for (int i = 0; i < n; i++) {
				List<Integer> oldPermutation = permutations.poll();
				// create a new permutation by adding current number at every
				// position
				for (int j = 0; j <= oldPermutation.size(); j++) {
					List<Integer> newPermutation = new ArrayList<>(oldPermutation);
					newPermutation.add(j, currentNumber);
					if (newPermutation.size() == nums.length) {
						result.add(newPermutation);
					} else {
						permutations.add(newPermutation);
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Permutation obj = new Permutation();
		System.out.println(obj.findPermutations(new int[] {1,3,5}));
	}

}
