package com.gfg_programs;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar = sc.nextInt();
		int ac = sc.nextInt();
		int br = sc.nextInt();
		int bc = sc.nextInt();
		double[][] a = new double[ar][ac];
		double[][] b = new double[br][bc];
		double[][] c = new double[ar][bc];

		for (int i = 0; i < ar; i++) {
			for (int j = 0; j < ac; j++) {
				a[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < br; i++) {
			for (int j = 0; j < bc; j++) {
				b[i][j] = sc.nextDouble();
			}
		}
		double sum = 0;
		for (int i = 0; i < ar; i++) {
			for (int j = 0; j < bc; j++) {
				for (int k = 0; k < br; k++) {
					sum += a[i][k] * b[k][j];
				}
				c[i][j] = sum;
				sum = 0;
			}
		}
		// System.out.println(Arrays.toString(c));
		for (int i = 0; i < ar; i++) {
			for (int j = 0; j < bc; j++) {
				// c[i][j] += a[i][j] * b[j][i];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
