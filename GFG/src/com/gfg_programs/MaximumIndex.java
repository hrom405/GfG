package com.gfg_programs;

import java.util.Scanner;

public class MaximumIndex {
	static int max;

	public static void main(String[] args) {
		int T, n;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		while (T-- > 0) {
			n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			max = 0;

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] <= a[j] && (j - i) > max)
						max = (j - i);
				}
			}
			System.out.println(max);
		}
	}
}
