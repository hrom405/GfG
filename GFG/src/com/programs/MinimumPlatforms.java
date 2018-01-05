package com.programs;

/*https://practice.geeksforgeeks.org/problems/minimum-platforms/0/?ref=self*/
import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlatforms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int d[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int dept = sc.nextInt();
				if (dept < a[i])
					dept += 2400;
				d[i] = dept;
			}
			Arrays.sort(a);
			Arrays.sort(d);

			int i = 1, j = 0;
			int p = 1;
			int max = 1;
			while (i < n && j < n) {
				if (a[i] < d[j]) {
					p = p + 1;
					i++;
					if (max < p)
						max = p;

				} else if (a[i] > d[j]) {
					j++;
					p = p - 1;
				} else {
					i++;
					j++;
				}
			}
			System.out.println(max);
		}
	}
}
