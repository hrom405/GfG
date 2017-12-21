package com.programs;
/*https://practice.geeksforgeeks.org/problems/print-diagonally/0*/

import java.util.Scanner;

public class PrintDiagonally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] matrix = new int[n][n];
			// int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					matrix[i][j] = sc.nextInt();

			int row = 0;
			int col = 0;
			for (int i = 0; i < n * 2 - 1; i++) {
				if (col < n - 1) {
					print(matrix, row, col, n);
					col++;
				}
				if (col == n - 1) {
					print(matrix, row, col, n);
					row++;
				}
			}
			System.out.println();
		}
	}

	public static void print(int[][] matrix, int row, int col, int n) {
		while (row < n && col >= 0) {
			System.out.print(matrix[row][col] + " ");
			row++;
			col--;
		}
	}
}
