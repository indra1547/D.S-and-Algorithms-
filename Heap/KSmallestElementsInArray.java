package com.indra.interviewProcess.Heaps.InteviewProblems;
/*If you are given an array and any number "k", can you write a code to 
 * find the "k" smallest
 * Input =  arr = [9,4,7,1,-2,6,5]        
    k = 3
    Output =  [-2,1,4]
 *  */

import java.util.PriorityQueue;

public class KSmallestInArray {
	public int[] findSmallest(int[] arr, int k) {
		int small[] = new int[k];
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for (int j : arr) {
			minHeap.add(j);
		}
		while (minHeap.size() - 1 != k) {
			for (int i = 0; i < k; i++) {
				small[i] = minHeap.poll();
			}
		}
		return small;

	}

	public static void main(String[] args) {
		KSmallestInArray obj = new KSmallestInArray();
		int[] result = obj.findSmallest(new int[] { 9, 4, 7, 1, -2, 6, 5 }, 3);
		for (int i : result) {
			System.out.println(i);
		}
	}

}
