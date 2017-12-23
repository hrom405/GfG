package com.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindWhetherPathExists {
	static int[][] matrix = {{3,1,2},
			  				 {3,0,0},
			  				 {3,3,2}};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int t = sc.nextInt();
		//while (t-- > 0) {
			//int n = sc.nextInt();
			
			/*for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					matrix[i][j] = sc.nextInt();*/

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (matrix[i][j] == 1) {
						System.err.println("i==>" + i + "\t\tj==>" + j + "\n");
						System.out.println(check(matrix, i, j));
					}
				}
			}
		}
	//}

	private static String check(int[][] matrix, int i, int j) {
		print(matrix);
		String ans = "No";
		try {
			if (matrix[i - 1][j] == 2 || matrix[i][j + 1] == 2 || matrix[i + 1][j] == 2 || matrix[i][j - 1] == 2) {
				return "Yes";
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		matrix[i][j] = 0;
		try {
			if (matrix[i][j - 1] == 3) {
				System.out.println("i==>" + i + "\tj==>" + (j - 1));
				check(matrix, i, j - 1);
			}
			if (matrix[i - 1][j] == 3) {
				System.out.println("i==>" + i + "\tj==>" + j);
				check(matrix, i - 1, j);
			}
			if (matrix[i][j + 1] == 3) {
				System.out.println("i==>" + i + "\tj==>" + j);
				check(matrix, i, j + 1);
			}
			if (matrix[i + 1][j] == 3) {
				System.out.println("i==>" + i + "\tj==>" + j);
				check(matrix, i + 1, j);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
		}
		return ans;
	}
	public static void print(int[][] matrix) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			}
	}
}
