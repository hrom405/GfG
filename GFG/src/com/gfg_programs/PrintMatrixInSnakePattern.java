package com.gfg_programs;

import java.util.Scanner;

public class PrintMatrixInSnakePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];

			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();

			print(a, n);
		}
	}

	private static void print(int[][] a, int n) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				for (j = 0; j < n; j++)
					System.out.print(a[i][j] + " ");

			else
				for (j = n - 1; j >= 0; j--)
					System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}
}
