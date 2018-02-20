package com.gfg_programs;

import java.util.Scanner;

public class EvenFibonacciNumbersSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long a[] = new long[10001];
		a[0] = 0;
		a[1] = 2;
		for (int i = 2; i <= 10000; i++)
			a[i] = a[i - 1] * 4 + a[i - 2];

		while (t-- > 0) {
			int n = in.nextInt();
			;
			long sum = 0;
			for (int j = 1; j < n; j++) {
				if (a[j] > n)
					break;
				else
					sum += a[j];
			}
			System.out.println(sum);
		}
	}
}
