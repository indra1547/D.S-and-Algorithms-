package com.indra.java.DataStructuresInJava.Arrays;

import java.util.*;

/*
 * In this problem, you have to implement the int[] findSum(int[] arr, int n) 
 * function which will take a number n and an array arr as an input and 
 * returns two integers that add up to n in an array.
 * 
 * arr = {1, 21, 3, 14, 5, 60, 7, 6}
   value = 27
   
   arr = {21, 6} or {6, 21}
 * */

public class FindSum {
	public int[] findSum(int[] nums, int n) {
		Set<Integer> set = new HashSet<Integer>();
		int[] res = new int[2];
		for (int i : nums) {
			if (set.contains(n - i)) {
				res[0] = i;
				res[1] = n - i;
				return res;
			}
			set.add(i);
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new FindSum().findSum(new int[] { 1, 21, 3, 14, 5, 60, 7, 6 }, 27)));
	}

}
