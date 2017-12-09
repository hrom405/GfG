package com.programs;

import java.util.Scanner;

public class MaxSumProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
	}

	private static int check(int n) {
		int max = n;
		int sum = 0;
		int[] arr = new int[3];
		arr[0] = n / 2;
		arr[1] = n / 3;
		arr[2] = n / 4;

		for (int i = 0; i < 3; i++) {

			if (arr[i] > 1)
				sum += check(arr[i]);
		}
		if (sum > max)
			max = sum;

		return max;
	}
}
