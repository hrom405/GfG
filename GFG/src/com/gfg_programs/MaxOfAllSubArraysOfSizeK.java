package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k/0/?ref=self*/
import java.util.Scanner;

public class MaxOfAllSubArraysOfSizeK {
	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] ans = new int[n - k - 1];
			a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			for (int j = 0; j <= n - k; j++) {
				int max = a[j];
				for (int l = j; l < j + k; l++) {
					if (max < a[l]) {
						max = a[l];
					}
				}
				System.out.print(max + " ");
			}
			System.out.println();
		}
	}
}
