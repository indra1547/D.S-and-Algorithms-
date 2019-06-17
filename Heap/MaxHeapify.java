package com.indra.interviewProcess.Heaps.InteviewProblems;

import java.util.Arrays;

public class MaxHeapify {
	public void heapify(int[] heapArray, int heapSize){
		for(int i= (heapSize-1)/2; i >= 0; i-- ){
			buildHeap(heapArray, i , heapSize);
		}
	}

	public void buildHeap(int[] heapArray, int index, int heapSize) {
		int largest = index;
		while(largest < heapSize/2){
			int left = (2*index)+1; // left child
			int right = (2*index)+2; // right child
			if(left < heapSize && heapArray[left] > heapArray[index]){
				largest = left;
			}
			if(right < heapSize && heapArray[right] > heapArray[largest]){
				largest = right;
			}
			if(largest != index){
				int temp = heapArray[index];
				heapArray[index] = heapArray[largest];
				heapArray[largest] = temp;
				index = largest;
			}else{
				break; // heap property satisfied
			}
			
		}
		
	}

	public static void main(String[] args) {
		int[] heapArray = { 1, 4, 7, 12, 15, 14, 9, 2, 3, 16 };
		new MaxHeapify().heapify(heapArray, heapArray.length);
		System.out.println("After heapify: "+Arrays.toString(heapArray));
		
	}

}
