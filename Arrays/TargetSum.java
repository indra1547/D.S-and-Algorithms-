package com.indra.Java.CodingPatterns.TwoPointer;
/*
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
 * Input: [1, 2, 3, 4, 6], target=6
   Output: [1, 3]
   Explanation: The number at index 1 and 3 add up to 6: 2+4=6
 * */

public class TargetSum {
	public int[] trargetSum(int arr[], int target) {
		int ptr1 = 0;
		int ptr2 = arr.length - 1;
		while (ptr1 < ptr2) {
			int targetDifference = target - arr[ptr1];
			if (targetDifference == arr[ptr2]) {
				return new int[] { ptr1, ptr2 };
			}
			if (targetDifference > arr[ptr2]) {
				ptr1++;
			} else {
				ptr2--;
			}
		}
		return new int[] { -1, -1 };

	}

	public static void main(String[] args) {
		TargetSum obj = new TargetSum();
		int result[] = obj.trargetSum(new int[] { 1, 2, 3, 4, 6 }, 6);
		for (int i : result) {
			System.out.println(i);
		}

	}

}
