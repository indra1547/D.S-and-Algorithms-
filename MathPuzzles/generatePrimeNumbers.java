package com.indra.java.algos;

/*A program to find all prime numbers lower than the input number 
 * using Sieve of Eratosthenes method*/

public class generatePrimeNumbers {
	public void findPrimeNumbers(int n) {
		/* Creating a boolean array to track prime number */
		boolean isPrime[] = new boolean[n + 1];
		for (int i = 0; i <n; i++)
			isPrime[i] = true;

		for (int j = 2; j * j <= n; j++) {
			if (isPrime[j] == true) {
				for (int k = j * j; k <= n; k += j)
					isPrime[k] = false;
			}
		}
		/* print prime numbers */
		for (int i = 2; i <=n; i++) {
			if (isPrime[i] == true)
				System.out.println(i + " ");
		}

	}

}
