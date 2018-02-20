package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/prime-number/0/?ref=self*/
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			if (isPrime(n)) {
				System.out.println("Yes");
			} else
				System.out.println("No");
		}
	}

	public static boolean isPrime(int i) {
		// System.out.println(i);
		int factors = 0;
		int j = 1;

		while (j <= i) {
			if (i % j == 0) {
				factors++;
			}
			j++;
		}
		return (factors == 2);
	}
}
