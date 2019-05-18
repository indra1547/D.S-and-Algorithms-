package com.indra.Java.CodingPatterns.SlidingWindow;

public class AverageOfSubArraysSlidingWindow {
	public double[] findAverage(int[] nums, int k) {
		double[] result = new double[nums.length -k + 1];
		int windowStart = 0;
		double sum = 0;
		for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			// add next element
			sum = sum + nums[windowEnd];
			if(windowEnd >= k-1) {
				result[windowStart] = sum/k;
				// delete the element which is out of window
				sum = sum - nums[windowStart];
				windowStart++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		AverageOfSubArraysSlidingWindow obj = new AverageOfSubArraysSlidingWindow();
		double[] result = obj.findAverage(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 }, 5);
		for (double i : result) {
			System.out.println(i);
		}
	}

}
