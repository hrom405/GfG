package com.programs;
/*https://practice.geeksforgeeks.org/problems/find-whether-path-exist/0/?ref=self*/
import java.util.Scanner;

public class FindWhetherPathExists {
	// static int[][] matrix = { { 0, 3, 2 }, { 3, 3, 0 }, { 1, 3, 0 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] matrix = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			boolean found = false;
			boolean visited[][] = new boolean[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (matrix[i][j] == 1) {
						// System.err.println("i==>" + i + "\t\tj==>" + j + "\n");
						found = check(matrix, i, j, visited);
						if (found)
							break;
					}
				}
				if (found)
					break;
			}
			if (found)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

	private static boolean check(int[][] matrix, int i, int j, boolean visited[][]) {
		// System.out.println("i==>" + i + "\tj==>" + j);

		if (j < 0 || j >= matrix[0].length || i < 0 || i >= matrix.length || visited[i][j])
			return false;

		if (matrix[i][j] == 2)
			return true;

		if (matrix[i][j] == 0)
			return false;

		if (matrix[i][j] == 1) {
			visited[i][j] = true;
			return check(matrix, i - 1, j, visited) || check(matrix, i + 1, j, visited)
					|| check(matrix, i, j - 1, visited) || check(matrix, i, j + 1, visited);
		}

		if (matrix[i][j] == 3) {
			visited[i][j] = true;
			return check(matrix, i - 1, j, visited) || check(matrix, i + 1, j, visited)
					|| check(matrix, i, j - 1, visited) || check(matrix, i, j + 1, visited);
		} else
			return false;
	}
}
