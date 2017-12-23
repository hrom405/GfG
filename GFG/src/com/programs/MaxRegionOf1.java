package com.programs;

import java.util.Scanner;

public class MaxRegionOf1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] matrix = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			int max = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (matrix[i][j] == 1) {
						int pairSize = findPairs(matrix, i, j, 0);

						if (max < pairSize) {
							max = pairSize;
						}
					}
				}
			}
			System.out.println(max);
		}
	}

	// Method will check all neighbours of 1 and replace it with 0 and keep
	// track of pair size
	static int findPairs(int[][] mx, int x, int y, int pairSize) {
		try {
			if (mx[x][y] == 1) {
				mx[x][y] = 0;
				pairSize++;
				pairSize = findPairs(mx, x + 1, y, pairSize);
				pairSize = findPairs(mx, x, y + 1, pairSize);
				pairSize = findPairs(mx, x - 1, y, pairSize);
				pairSize = findPairs(mx, x, y - 1, pairSize);
				pairSize = findPairs(mx, x + 1, y + 1, pairSize);
				pairSize = findPairs(mx, x - 1, y - 1, pairSize);
				pairSize = findPairs(mx, x + 1, y - 1, pairSize);
				pairSize = findPairs(mx, x - 1, y + 1, pairSize);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		}

		return pairSize;
	}

}
