package com.indra.java.DataStructuresInJava.Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * In this problem, you have to implement the void reArrange(int[] arr)
 *  function which will sort the elements, such that all the negative elements 
 *  appear at the left and positive elements appear at the right.
 *  
 *  arr = {10, -1, 20, 4, 5, -9, -6}
 *  arr = {-1, -9, -6, 10, 20, 4, 5}
 * 
 * */

public class ReArrangePosAndNeg {
	public void reArrangeUsingHeaps(int[] arr){
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int i : arr){
			minHeap.add(i);
		}
		while(!minHeap.isEmpty()){
			for(int i=0; i < arr.length; i++){
				arr[i] = minHeap.poll();
			}
		}
	}
	public void reArrangeInPlace(int[] arr){
		 int j = 0;
		 for(int i = 0; i<arr.length; i++){
			 if(arr[i] < 0){
				 if(i !=j){
					 int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
				 j++;
			 }
		 }
	}

	public static void main(String[] args) {
		int arr[] = new int[] {10, -1, 20, 4, 5, -9, -6};
		int arr1[] = new int[] {2, 4, -6, 8, -5, -10};
		new ReArrangePosAndNeg().reArrangeUsingHeaps(arr1);
		System.out.println(Arrays.toString(arr1));
		new ReArrangePosAndNeg().reArrangeInPlace(arr);
		System.out.println(Arrays.toString(arr));

	}

}
