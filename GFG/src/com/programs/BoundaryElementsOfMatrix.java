package com.programs;

import java.util.Scanner;

public class BoundaryElementsOfMatrix {

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
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				if (i > 0 && i < n - 1 && j > 0 && j < n - 1)
					continue;
				else
					System.out.print(a[i][j] + " ");
			}
		System.out.println();
	}

}
