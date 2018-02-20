package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range/0*/
import java.util.Scanner;

public class FindPrimeNumbersInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int low = sc.nextInt();
			int high = sc.nextInt();

			check(low, high);
			System.out.println();
		}
	}

	private static void check(int low, int high) {
		for (int i = low; i <= high; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
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
