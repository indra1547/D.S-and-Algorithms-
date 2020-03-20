package com.indra.ads.arrays;

import java.util.Arrays;

/*
 * arr = [1,2,3,4,5,0,0,0,6,7,8,9,10]
 * sum = 15
 * o/p = [1,8]
 * 
 * */

public class FindLongestSubArrayBySum {
	public static int[] methodLinear(int[] nums, int s){
		int result[] = new int[]{-1};
		int left = 0;
		int right = 0;
		int sum = 0;
		while(right < nums.length){
			sum += nums[right];
			while(left < right && sum > s){
				sum -= nums[left++];
			}
			if(sum == s && (result.length == 1 || result[1] - result[0] < right - left)){
				result = new int[]{left+1, right+1};
			}
			right++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		int[] res4 = methodLinear(new int[]{6,7,8,9,10,1,2,3,4,5,0,0,0}, 15);
		int[] res5 = methodLinear(new int[]{1,2,3,4,5,0,0,0,6,7,8,9,10}, 15);
		int[] res6 = methodLinear(new int[]{1,2,3,7,5}, 12);
		System.out.println(Arrays.toString(res4));
		System.out.println(Arrays.toString(res5));
		System.out.println(Arrays.toString(res6));

	}

}
