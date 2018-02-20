package com.gfg_programs;

import java.util.Arrays;
import java.util.Scanner;

public class SeriesX1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] arr1 = new int[200];
			int[] arr2 = new int[200];
			int[] arr3 = new int[200];

			for (int i = 1; i <= 200; i++)
				arr1[i - 1] = i * 6;
			// System.out.println(Arrays.toString(arr1));

			for (int i = 1; i < 200; i++) {
				arr2[0] = 8;
				arr2[i] = arr2[i - 1] + arr1[i];
			}
			// System.out.println(Arrays.toString(arr2));

			for (int i = 1; i < 200; i++) {
				arr3[0] = 2;
				arr3[i] = arr3[i - 1] + arr2[i - 1];
			}
			// System.out.println(Arrays.toString(arr3));

			System.out.println(arr3[n - 1]);

		}
	}

}
