package com.indra.CodingPatterns.TopKElements;

import java.util.PriorityQueue;

/*
 * Given ‘N’ ropes with different lengths, we need to connect these ropes 
 * into one big rope with minimum cost. The cost of connecting two ropes 
 * is equal to the sum of their lengths.
 * Input: [1, 3, 11, 5]
   Output: 33
   Explanation: First connect 1+3(=4), then 4+5(=9), and then 9+11(=20). 
   So the total cost is 33 (4+9+20)
 * */

public class ConnectingRopes {
	public int findMinCost(int[] nums) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for (int i : nums) {
			minHeap.add(i);
		}
		// go through all values in heap, add two small ropes and add resultant
		// in minHeap and do the same operation till minHeap size is 1
		int result = 0;
		int temp = 0;
		while (minHeap.size() > 1) {
			temp = minHeap.poll() + minHeap.poll();
			result += temp;
			minHeap.add(temp);
		}
		return result;
	}

	public static void main(String[] args) {
		ConnectingRopes obj = new ConnectingRopes();
		System.out.println(obj.findMinCost(new int[] { 1, 3, 11, 5 }));
	}

}
