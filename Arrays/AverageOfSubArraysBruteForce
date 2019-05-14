package com.indra.Java.CodingPatterns.SlidingWindow;

/*Given an array, find the average of all subarrays of size ‘K’ in it.
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 * Output: [2.2, 2.8, 2.4, 3.6, 2.8]*/

public class AverageOfSubArraysBruteForce {
	public double[] findAverage(int[] nums, int k) {
		double[] result = new double[nums.length - k + 1];
		for (int i = 0; i <= nums.length - k; i++) {
			double sum = 0;
			for (int j = i; j < i + k; j++) {
				sum = sum + nums[j];
				result[i] = sum / k;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		AverageOfSubArraysBruteForce obj = new AverageOfSubArraysBruteForce();
		double[] result = obj.findAverage(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 }, 5);
		for (double i : result) {
			System.out.println(i);
		}

	}

}
