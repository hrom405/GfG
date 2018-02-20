package com.gfg_programs;

import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int T, n, s, sum, start, end, flag;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		while (T-- > 0) {
			n = sc.nextInt();
			s = sc.nextInt();
			int num;
			int[] a = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			sum = 0;
			flag = 0;
			start = 0;
			end = 0;

			while (n > end) {
				sum += a[end];
				if (sum > s) {
					start++;
					end = start;
					sum = 0;
				} else if (sum == s) {
					flag = 1;
					break;
				} else
					end++;
			}
			if (flag == 1)
				System.out.println((start + 1) + " " + (end + 1));
			else
				System.out.println(-1);
		}
	}
}
