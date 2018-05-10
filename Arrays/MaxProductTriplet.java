package com.indra.java.Arrays;
/*Program to find highest product of three numbers in an Array*/

import java.util.Arrays;

public class MaxProductTriplet {
	public int findMaxTriplet(int a[]){
		Arrays.sort(a);
		int n = a.length;
		return a[n-1]*a[n-2]*a[n-3];
	}

	public static void main(String[] args) {
		MaxProductTriplet obj = new MaxProductTriplet();
		int a[] ={10,3,5,6,20};
		int b[] = {-10,-3,-5,-6,-20};
		int c[] = {1,-4,3,-6,7,0};
		System.out.println("Max Triplet of a[] :"+obj.findMaxTriplet(a));
		System.out.println("Max Triplet of b[] :"+obj.findMaxTriplet(b));
		System.out.println("Max Triplet of c[] :"+obj.findMaxTriplet(c));
	}

}
