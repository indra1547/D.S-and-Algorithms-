package com.indra.Java.CodingPatterns.TwoPointer;
/*
 * Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order.
 * Input: [-2, -1, 0, 2, 3]
   Output: [0, 1, 4, 4, 9]
 * */

public class SquaringSortedArray {
	public int[] squaredArray(int[] arr) {
		int n = arr.length;
		int squares[] = new int[n];
		int highestSquaredIndex = n - 1;
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int leftSquare = arr[left] * arr[left];
			int rightSquare = arr[right] * arr[right];
			if (leftSquare > rightSquare) {
				squares[highestSquaredIndex--] = leftSquare;
				left++;
			} else {
				squares[highestSquaredIndex--] = rightSquare;
				right--;
			}
		}
		return squares;
	}

	public static void main(String[] args) {
		SquaringSortedArray obj = new SquaringSortedArray();
		int res[] = obj.squaredArray(new int[] { -2, -1, 0, 2, 3 });
		for (int i : res) {
			System.out.println(i);
		}
	}

}
