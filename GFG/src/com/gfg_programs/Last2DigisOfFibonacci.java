package com.gfg_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Last2DigisOfFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[300];
		Arrays.fill(arr, 0);
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < 300; i++)
			arr[i] = (arr[i - 1] + arr[i - 2]) % 100;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			System.out.println(arr[x % 300]);
		}
	}
}
