package com.indra.AmazonLeetCode;

/*
 * Eg1: Input: 2.00000, 10
   Output: 1024.00000
   
   Eg2: Input: 2.10000, 3
   Output: 9.26100
   
   Eg3: Input: 2.00000, -2
		Output: 0.25000
		Explanation: 2-2 = 1/22 = 1/4 = 0.25
 * */

public class Power {
	public double myPow(double x, int n) {
		if (n == 0 || x == 1)
			return 1;
		if (x == -1 && n % 2 != 0)
			return -1;
		if (x == -1 && n % 2 == 0)
			return 1;
		if (n < 0) {
			x = 1 / x;
			if (n == Integer.MIN_VALUE)
				n = Integer.MAX_VALUE;
			else
				n = -n;
		}
		if (n == Integer.MAX_VALUE)
			return 0;
		if (n % 2 == 0) {
			double y = myPow(x, n / 2);
			return y * y;
		} else {
			return x * myPow(x, n - 1);
		}

	}

	public static void main(String[] args) {
		Power obj = new Power();
		System.out.println(obj.myPow(2.0000000, 10));
		System.out.println(obj.myPow(2.10000, 3));
		System.out.println(obj.myPow(2.00000, -2));
		System.out.println(obj.myPow(2.00000, -2147483648));

	}

}
