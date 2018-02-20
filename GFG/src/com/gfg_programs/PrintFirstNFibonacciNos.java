package com.gfg_programs;

import java.util.Scanner;

public class PrintFirstNFibonacciNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long[] a = new long[100];
			a[0] = 1;
			a[1] = 1;
			for (int i = 2; i < 100; i++) {
				a[i] = a[i - 2] + a[i - 1];
			}
			int k = sc.nextInt();
			for (int i = 0; i < k; i++)
				System.out.print(a[i] + " ");
			System.out.println();
		}
	}

}
