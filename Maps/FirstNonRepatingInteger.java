package com.indra.java.DataStructuresInJava.Arrays;
/*
 * In this problem, you have to implement the int findFirstUnique(int[] arr) 
 * function that will look for a first unique integer which appears only once 
 * in the whole array.
 * 
 * arr = {9, 2, 3, 2, 6, 6}
 * o/p = 9
 * */

import java.util.*;

public class FirstNonRepatingInteger {
	public int findFirstUnique(int[] arr){
		int missingNumber = 0;
		Map<Integer, Integer> fMap = new HashMap<Integer, Integer>();
		for(int i : arr){
			fMap.put(i, fMap.getOrDefault(i, 0) + 1);
		}
		for(Map.Entry<Integer, Integer> entry : fMap.entrySet()){
			if(entry.getValue() == 1){
				missingNumber = entry.getKey();
			}
		}
		return missingNumber;
	}

	public static void main(String[] args) {
		FirstNonRepatingInteger obj = new FirstNonRepatingInteger();
		System.out.println(obj.findFirstUnique(new int[] {4,5,1,2,0,4}));
	}

}
