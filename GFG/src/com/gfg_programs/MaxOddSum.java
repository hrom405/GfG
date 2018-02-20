package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/max-odd-sum/0/?ref=self*/
import java.util.Scanner;

public class MaxOddSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			// int k = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int sum = 0;
			int m = Integer.MAX_VALUE;
			boolean isOdd = false;
			for (int i = 0; i < n; i++) {
				if (a[i] > 0) {
					sum = sum + a[i];
				}
				if (a[i] % 2 != 0) {
					isOdd = true;
					if (m > Math.abs(a[i]))
						m = Math.abs(a[i]);
				}
			}
			if (isOdd == false) {
				System.out.println(-1);
			} else {
				if (sum % 2 == 0) {
					sum = sum - m;
				}
				System.out.println(sum);
			}
		}
	}
}
