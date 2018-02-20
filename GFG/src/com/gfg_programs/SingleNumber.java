package com.gfg_programs;

import java.util.Scanner;

public class SingleNumber {
	static int k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			int cnt;
			boolean hai = false;
			for (int i = 0; i <= 50; i++) {
				cnt = 0;
				k = 0;
				for (int j = 0; j < n; j++) {
					if (a[j] == i)
						cnt++;
				}
				if (cnt % 2 != 0) {
					hai = true;
					k = i;
					System.out.println(k);
					break;
				}
			}
		}
	}
}
