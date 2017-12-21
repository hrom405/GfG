package com.programs;

/*https://practice.geeksforgeeks.org/problems/sorted-matrix/0/?ref=self*/
import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] matrix = new int[n][n];
			int[] a = new int[n * n];
			int k = 0;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					matrix[i][j] = sc.nextInt();
					a[k++] = matrix[i][j];
				}
			k = 0;
			Arrays.sort(a);

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = a[k++];
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
