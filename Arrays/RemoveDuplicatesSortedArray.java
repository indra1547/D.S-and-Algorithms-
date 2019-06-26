package com.indra.Java.CodingPatterns.TwoPointer;

public class RemoveDuplicatesSortedArray {
	public int remove(int arr[]) {
		int nextNonDuplicate = 1;
		for(int i=1; i<arr.length; i++) {
			if((arr[nextNonDuplicate - 1]) != arr[i]) {
				arr[nextNonDuplicate] = arr[i];
				nextNonDuplicate ++;
			}
		}
		return nextNonDuplicate;
	}

	public static void main(String[] args) {
		RemoveDuplicatesSortedArray obj = new RemoveDuplicatesSortedArray();
		System.out.println(obj.remove(new int[] {2, 3, 3, 3, 6, 9, 9 }));
	}

}
