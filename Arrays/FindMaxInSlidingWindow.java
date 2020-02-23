package com.indra.ads.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindMaxInSlidingWindow {
	
	public static List<Integer> findMax(int[] arr, int windowSize){
		List<Integer> list = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<= arr.length - windowSize; i++){
			for(int j = i; j < i+windowSize; j++){
				if(arr[j] > max){
					max = arr[j];
				}
			}
			list.add(max);
			max=Integer.MIN_VALUE;
		}
		return list;
	}
	

	public static void main(String[] args) {
		List<Integer> res = FindMaxInSlidingWindow.findMax(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3);
		//o/p: [3, 4, 5, 6, 7, 8, 9, 10]
		List<Integer> res1 = FindMaxInSlidingWindow.findMax(new int[]{10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67}, 3);
		//o/p: [10, 9, 23, 23, 34, 56, 67, 67, 67, -1, -2, 9, 10, 34, 67]
		System.out.println(res);
		System.out.println(res1);
	}

}
