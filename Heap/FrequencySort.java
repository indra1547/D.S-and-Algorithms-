package com.indra.CodingPatterns.TopKElements;
/*
 * Given a string, sort it based on the decreasing frequency of its characters.
 * 
 * Input: "Programming"
   Output: "rrggmmPiano"
   Explanation: 'r', 'g', and 'm' appeared twice, so they need to appear 
   before any other character.
 * */

import java.util.*;

public class FrequencySort {
	public String frequencySort(String s) {
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for (char ch : s.toCharArray()) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}
		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<Map.Entry<Character, Integer>>(
				(e1, e2) -> e2.getValue() - e1.getValue());
		maxHeap.addAll(frequencyMap.entrySet());
		// build a string and append the most frequent characters
		StringBuilder sortedString = new StringBuilder(s.length());
		while (!maxHeap.isEmpty()) {
			Map.Entry<Character, Integer> entry = maxHeap.poll();
			for (int i = 0; i < entry.getValue(); i++) {
				sortedString.append(entry.getKey());
			}
		}
		return sortedString.toString();
	}

	public static void main(String[] args) {
		FrequencySort obj = new FrequencySort();
		System.out.println(obj.frequencySort("Programming"));
	}

}
