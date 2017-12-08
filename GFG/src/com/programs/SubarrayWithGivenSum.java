package com.programs;

import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int sum = sc.nextInt();
			int num;
			int[] arr = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			for (int i = 0; i < n; i++) {
				num = 0;
				boolean hey = false;
				for (int j = i; j < n; j++) {
					num += arr[j];
					if (num == sum) {
						System.out.print((i + 1) + " " + (j + 1));
						hey = true;
						break;
					}
				}
				if (hey == true)
					break;
				else
					System.out.println();
			}
			System.out.println();
		}
	}
}
