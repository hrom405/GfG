package com.programs;

import java.util.Scanner;

public class MaximumIntervalsOverlap {
	static int max;
	static int b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] entry = new int[n];
			int[] exit = new int[n];

			for (int i = 0; i < n; i++)
				entry[i] = sc.nextInt();

			for (int i = 0; i < n; i++)
				exit[i] = sc.nextInt();

			for (int i = 0; i < n; i++) {
				if (i < n - 1 && entry[i] > entry[i + 1]) {
					int temp = entry[i];
					entry[i] = entry[i + 1];
					entry[i + 1] = temp;

					temp = exit[i];
					exit[i] = exit[i + 1];
					exit[i + 1] = temp;
				}
			}
			// System.out.println(Arrays.toString(entry) + "\n" + Arrays.toString(exit));
			max = 1;
			b = 0;
			for (int i = 0; i < n; i++) {
				int cnt = 1;
				int c = 0;
				int a = exit[i];
				for (int j = i + 1; j < n; j++) {
					if (entry[j] <= a) {
						c = entry[j];
						cnt++;
					}
				}
				if (max < cnt) {
					max = cnt;
					b = c;
				}
			}
			System.out.println(max + " " + b);
		}
	}
}
