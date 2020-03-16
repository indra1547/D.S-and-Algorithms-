package com.indra.ads.arrays;

import java.util.Arrays;

/* Given array of nums n, where n > 1 find product of array itself
 * I/P [1,2,3,4]
 * O/P [24,12,8,6]
 * 
 * */

public class ProductOfArrayItself {

	/*
	 * Time Complexity - O(n)
	 */

	public static int[] methodWithDivision(int[] nums) {
		int output[] = new int[nums.length];
		int sum = 1;
		if (nums.length < 1) {
			return output;
		}
		for (int i = 0; i < nums.length; i++) {
			sum *= nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			output[i] = sum / nums[i];
		}
		return output;
	}

	public static int[] methodWithoutDivision(int[] nums) {
		int[] left_products = new int[nums.length];
		int[] right_products = new int[nums.length];
		int output[] = new int[nums.length];
		left_products[0] = 1;
		right_products[nums.length - 1] = 1;
		if (nums.length < 1) {
			return output;
		}
		for (int i = 1; i < nums.length; i++) {
			left_products[i] = nums[i - 1] * left_products[i - 1];
		}
		for (int i = nums.length - 2; i >= 0; i--) {
			right_products[i] = nums[i + 1] * right_products[i + 1];
		}
		for (int i = 0; i < nums.length; i++) {
			output[i] = left_products[i] * right_products[i];
		}
		return output;
	}

	public static int[] methodWithoutExtraSpace(int[] nums) {
		int output[] = new int[nums.length];
		if (nums.length < 1) {
			return output;
		}
		output[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			output[i] = nums[i - 1] * output[i - 1];
		}
		int r = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			output[i] = output[i] * r;
			r = r * nums[i];
		}
		return output;
	}

	public static void main(String[] args) {
		int[] res = methodWithDivision(new int[] { 4, 6, 8, 10 });
		int[] res1 = methodWithoutDivision(new int[] { 4, 6, 8, 10 });
		int[] res2 = methodWithoutExtraSpace(new int[] { 4, 6, 8, 10 });
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(res1));
		System.out.println(Arrays.toString(res2));
	}

}
