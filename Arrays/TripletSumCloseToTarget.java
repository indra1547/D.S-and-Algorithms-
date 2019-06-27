package com.indra.CodingPatterns.TwoPointer;
/*
 * Given an array of unsorted numbers and a target number, 
 * find a triplet in the array whose sum is as close to the target number 
 * as possible.
 * 
 * Input: [-2, 0, 1, 2], target=2
   Output: 1
   Explanation: The triplet [-2, 1, 2] has the closest sum to the target.

 * */

import java.util.Arrays;

/*
 * Approach: a+b+c = targetSum
 * Find target difference i.e targetSum - a - b - c;
 * Based on the difference adjust pointers to get the closest target.
 * */

public class TripletSumCloseToTarget {
	public int sum(int[] arr, int targetSum) {
		Arrays.sort(arr);
		int smallDifference = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {
			int left = i + 1;
			int right = arr.length - 1;
			while (left < right) {
				int targetDiff = targetSum - arr[i] - arr[left] - arr[right];
				if (targetDiff == 0) { // found triplet
					return targetSum - targetDiff; // sum of all triplets
				}
				if (Math.abs(targetDiff) < Math.abs(smallDifference)) {
					smallDifference = targetDiff; // saving the closest
													// difference
				}
				if (targetDiff > 0) { // search for bigger value
					left++;
				} else {
					right--; // search for smaller value
				}
			}
		}
		return targetSum - smallDifference;
	}

	public static void main(String[] args) {
		TripletSumCloseToTarget obj = new TripletSumCloseToTarget();
		System.out.println(obj.sum(new int[] { 1, 0, 1, 1 }, 1000));
	}

}
