package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/find-difference-between-sum-of-diagonals/0*/
import java.util.Scanner;

public class FindDifferenceBetweenSumOfDiagonals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int s1 = 0;
			int s2 = 0;
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					a[i][j] = sc.nextInt();
					if (i == j)
						s1 += a[i][j];
				}
			}
			int i = 0;
			int j = n - 1;
			while (i < n && j > -1) {
				s2 += a[i][j];
				i++;
				j--;
			}
			System.out.println(Math.abs(s1 - s2));
		}
	}
}
