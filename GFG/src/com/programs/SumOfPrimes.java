package com.programs;

/*https://practice.geeksforgeeks.org/problems/sum-of-primes/0/?ref=self*/
import java.util.Scanner;

public class SumOfPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(sum(n + ""));
		}
	}

	public static int sum(String s) {
		int summ = 0;
		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i) - '0';
			if (isPrime(n))
				summ += n;
		}
		return summ;
	}

	public static boolean isPrime(int i) {
		// System.out.println(i);
		int factors = 0;
		int j = 1;

		while (j <= i) {
			if (i % j == 0)
				factors++;
			j++;
		}
		return (factors == 2);
	}
}
