package com.programs;

import java.util.Scanner;

public class PairsDivisibleBy4 {

	private static int check(int[] a, int n) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((a[i] + a[j]) % 4 == 0)
					cnt++;
			}
		}
		return cnt;
	}

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

}
