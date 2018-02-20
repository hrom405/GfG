package com.gfg_programs;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			long a[] = new long[n];
			for (int j = 0; j < n; j++) {
				a[j] = s.nextLong();
			}

			long c = s.nextLong();
			long d = s.nextLong();
			long ss = s.nextLong();

			double m = a[0];
			for (int i = 0; i < n - 1; i++) {
				if (a[i + 1] > a[i]) {
					m += a[i + 1] - a[i];
				}
			}
			System.out.printf("%.9f", m * (c - 1));

		}
	}
}
