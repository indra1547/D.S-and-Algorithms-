package com.indra.interviewProcess.Heaps.InteviewProblems;
/*
 * f you are given an array and any number "k", can you write a code to 
 * find the "k" largest elements 
 * Input arr = [9,4,7,1,-2,6,5]           k = 3
 * Output = [9,7,6]
 * 
 * */

import java.util.Comparator;
import java.util.PriorityQueue;

public class KLargestElementInArray {
	public int[] findLargestK(int arr[], int k) {
		int[] largest = new int[k];
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(arr.length, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b - a;
			}

		});
		for (int j : arr) {
			maxHeap.add(j);
		}
		while (maxHeap.size() - 1 != k) {
			for (int i = 0; i < k; i++) {
				largest[i] = maxHeap.poll();
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		KLargestElementInArray obj = new KLargestElementInArray();
		int[] result = obj.findLargestK(new int[] { 9, 4, 7, 1, -2, 6, 5 }, 3);
		for (int i : result) {
			System.out.println(i);
		}

	}

}
