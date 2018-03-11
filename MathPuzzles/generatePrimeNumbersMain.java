package com.indra.java.algos;

import java.util.Scanner;

public class generatePrimeNumbersMain {

	public static void main(String[] args) {
		System.out.println("Enter input");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		generatePrimeNumbers primes = new generatePrimeNumbers();
		System.out.println("Prime numbers for given input");
		primes.findPrimeNumbers(n);
	}

}
