package com.indra.java.DataStructuresInJava.Arrays;

import java.util.Arrays;

/*
 * In this problem, you have to implement the void maxMin(int[] arr) function. 
 * This will re-arrange the elements of a sorted array in such a way that the 
 * first position will have the largest number, the second will have the
 * smallest, the third will have the second largest, and so on.
 * 
 * arr = {1, 2, 3, 4, 5}
 * o/p: arr = {5, 1, 4, 2, 3}
 * */

public class ReArrangeInMinMaxForm {
	public void maxMin(int[] arr){
		int[] res = new int[arr.length];
		int smallPointer = 0;
		int largerPointer = arr.length - 1;
		boolean flag = true;
		for(int i = 0; i < arr.length; i++){
			if(flag){
				res[i] = arr[largerPointer --];
			}else{
				res[i] = arr[smallPointer++];
			}
			flag = !flag;
		}
		for(int i= 0; i<arr.length; i++){
			arr[i] = res[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5};
		ReArrangeInMinMaxForm obj = new ReArrangeInMinMaxForm();
		obj.maxMin(arr);
		System.out.println(Arrays.toString(arr));
	}

}
