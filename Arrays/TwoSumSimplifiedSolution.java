package com.indra.Arrays;
/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
  eg:
  Given nums = [2, 7, 11, 15], target = 9,
  Because nums[0] + nums[1] = 2 + 7 = 9,
  return [0, 1].
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public int[] twoSum(int[] arr, int target) {
		int result[] = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(target - arr[i])) {
				result[0] = i;
				result[1] = map.get(target - arr[i]);
				return result;
			}
			map.put(arr[i], i);
		}
		return result;
	}
	

	public static void main(String[] args) {
		TwoSum obj = new TwoSum();
		int[] result = obj.twoSum(new int[] {2,8,11,15,7},9);
		for(int print : result) {
			System.out.println(print);
		}
	}

}
