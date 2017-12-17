package com.programs;

import java.util.Scanner;

public class PrintDiagonally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					System.out.print(a[i][j] + " ");
			// print(a, n);
		}
	}

	private static void print(int[][] a, int n) {
		// int row = n;
		// int col = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(a[i][j] + " ");
				} else {
					while (i++ != j--) {
						System.out.print(a[i][j]);
					}
				}
			}
		}
	}

}
