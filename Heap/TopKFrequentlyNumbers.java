package com.indra.CodingPatterns.TopKElements;

/*
 * Given an unsorted array of numbers, find the top ‘K’ frequently occurring 
 * numbers in it.
 * Input: [1, 3, 5, 12, 11, 12, 11], K = 2
   Output: [12, 11]
   Explanation: Both '11' and '12' apeared twice. 
 * */

import java.util.*;

public class TopKFrequentlyNumbers {
	public List<Integer> findTopFreqNumbers(int[] nums, int k) {
		List<Integer> frequentNumbers = new ArrayList<Integer>(k);
		// First we will find frequency of  numbers using hashMap
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		for (int i : nums) {
			frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
		}
		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<Map.Entry<Integer, Integer>>(
				(e1, e2) -> e2.getValue() - e1.getValue());
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			maxHeap.add(entry);
		}
		for(int i = 0; i < k; i++){
			frequentNumbers.add(maxHeap.poll().getKey());
		}
		return frequentNumbers;
	}

	public static void main(String[] args) {
		TopKFrequentlyNumbers obj = new TopKFrequentlyNumbers();
		System.out.println(obj.findTopFreqNumbers(new int[] { 1, 3, 5, 12, 11, 12, 11 }, 2));
	}

}
