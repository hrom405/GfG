package com.programs;

/*https://practice.geeksforgeeks.org/problems/sexy-primes/0/?ref=self*/
import java.util.Scanner;

public class SexyPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int low = sc.nextInt();
			int high = sc.nextInt();

			for (int i = low; i <= high; i++) {
				if (isPrimeNumber(i) && isPrimeNumber(i + 6)) {
					if ((i + 6) <= high) {
						System.out.print(i + " " + (i + 6) + " ");
					}
				}
			}
			System.out.println();
		}
	}

	public static boolean isPrimeNumber(int i) {
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
