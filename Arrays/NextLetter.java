package com.indra.CodingPatterns.BinarySearch;
/*Given an array of lowercase letters sorted in ascending order, find the 
 * smallest letter in the given array greater than a given ‘key’.Assume the 
 * given array is a circular list, which means that the last letter is assumed 
 * to be connected with the first letter. This also means that the smallest 
 * letter in the given array is greater than the last letter of the array and 
 * is also the first letter of the array.Write a function to return the next 
 * letter of the given ‘key’.
 * 
 * Input: ['a', 'c', 'f', 'h'], key = 'f'
   Output: 'h'
   Explanation: The smallest letter greater than 'f' is 'h' in the given array.
 * */

public class NextLetter {
	public char findNextLetter(char[] letters, char key) {
		int n = letters.length;
		int start = 0;
		int end = n - 1;
		if (key < letters[0] || key > letters[n - 1]) {
			return letters[0];
		}
		while (start <= end) {
			int middle = start + (end - start) / 2;
			if (key < letters[middle]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return letters[start % n];

	}

	public static void main(String[] args) {
		NextLetter obj = new NextLetter();
		System.out.println(obj.findNextLetter(new char[] { 'a', 'b', 'c', 'd', 'f', 'h' }, 'f'));
		System.out.println(obj.findNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'h'));
		System.out.println(obj.findNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'm'));
		System.out.println(obj.findNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'b'));
	}

}
