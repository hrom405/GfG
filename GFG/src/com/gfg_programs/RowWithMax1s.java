package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/row-with-max-1s/0/?ref=self*/
import java.util.Scanner;

public class RowWithMax1s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] matrix = new int[n][m];

			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					matrix[i][j] = sc.nextInt();

			int[] a = new int[n];
			int cnt, max = 0;

			for (int i = 0; i < n; i++) {
				cnt = 0;
				for (int j = 0; j < m; j++) {
					if (matrix[i][j] == 1)
						cnt++;
				}
				a[i] = cnt;
			}
			int pos = 0;
			for (int i = 0; i < n; i++) {
				if (max < a[i]) {
					max = a[i];
					pos = i;
				}
			}
			System.out.println(pos);
		}
	}

}
