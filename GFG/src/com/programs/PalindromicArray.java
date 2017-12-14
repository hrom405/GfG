package com.programs;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromicArray {
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			cnt = 0;

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			if (check(a) == true)
				System.out.println(cnt);
			else {
				modify(a);
				System.out.println(cnt);
			}
		}
	}

	private static void modify(int[] arr) {
		if (arr.length == 1) {
			return;
		} else {

			int[] b = new int[arr.length - 1];
			b[0] = arr[0] + arr[1];
			for (int i = 1; i < b.length; i++) {
				b[i] = arr[i + 1];
			}
			System.out.println(Arrays.toString(b));
			cnt++;
			if (check(b) != true)
				modify(b);
		}
	}

	private static boolean check(int[] arr) {
		int sum = 0;
		int p = 0;
		int q = arr.length - 1;
		int[] rev = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			rev[i] = arr[q];
			q--;
		}
		// System.out.println(Arrays.toString(rev));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != rev[i])
				sum++;
		}

		if (sum > 0)
			return false;
		else
			return true;
	}
}
