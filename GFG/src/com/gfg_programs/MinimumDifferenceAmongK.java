package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/minimum-difference-among-k/0/?ref=self*/
import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferenceAmongK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			System.out.println(check(a, n, k));
		}
	}

	public static int check(int a[], int n, int k) {
		int result = Integer.MAX_VALUE;
		Arrays.sort(a);
		for (int i = 0; i <= n - k; i++)
			result = Math.min(result, a[i + k - 1] - a[i]);
		return result;
	}
}
