package com.programs;

import java.util.Scanner;

public class MaximumValueInBitonicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(check(a, n));
		}
	}

	static int check(int[] a, int n) {
		int num = 0;
		for (int i = 0; i < n; i++) {
			if (a[i + 1] < a[i]) {
				num = a[i];
				break;
			}
		}
		return num;
	}
}
