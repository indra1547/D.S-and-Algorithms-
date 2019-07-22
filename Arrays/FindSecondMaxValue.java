package com.indra.java.DataStructuresInJava.Arrays;
/*
 * In this problem, you have to implement the int findSecondMaximum(int[] arr)
 * function which will traverse the whole array and return the second largest
 * element present in the array.
 * 
 * arr = {9,2,3,6}
 * 6
 * */

import java.util.PriorityQueue;

public class FindSecondMaxValue {
	public int findSecondMaxUsingHeaps(int[] arr){
		int secondMax = 0;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(
				(a,b) -> Integer.compare(b, a));
		for(int i : arr){
			maxHeap.add(i);
		}
		secondMax = maxHeap.poll();
		secondMax = maxHeap.poll();
		return secondMax;
	}
	public int findSecondMax(int[] arr){
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i =1; i<arr.length; i++){
			if(arr[i] > firstMax){
				firstMax = arr[i];
			}
		}
		for(int j=0; j<arr.length; j++){
			if(arr[j] != firstMax && arr[j] > secondMax){
				secondMax = arr[j];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		FindSecondMaxValue obj = new FindSecondMaxValue();
		System.out.println(obj.findSecondMaxUsingHeaps(new int[] {4,2,1,5,0}));
		System.out.println(obj.findSecondMax(new int[] {4,2,1,5,0}));
	}

}
