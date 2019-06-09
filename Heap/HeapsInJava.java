package com.indra.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapsInJava {

	public static void main(String[] args) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		});
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int[] arr = new int[] { 1, 9, 8, 2, 3, 4, 6, 5, 10, 7 };
		for (int item : arr) {
			maxHeap.add(item);
			minHeap.add(item);
		}
		System.out.println("MaxHeap");
		while (maxHeap.size() != 0) {
			System.out.println(maxHeap.poll());
		}
		System.out.println("MinHeap");
		while (minHeap.size() != 0) {
			System.out.println(minHeap.poll());
		}
	}
}
