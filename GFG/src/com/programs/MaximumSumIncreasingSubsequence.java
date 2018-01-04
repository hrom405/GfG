package com.programs;

/*https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence/0/?ref=self*/
import java.util.Scanner;

public class MaximumSumIncreasingSubsequence {
	static int[] a;
	static int fir;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(check(a, n));
		}
	}

	static int check(int arr[], int n) {
		int i, j, max = 0;
		int msis[] = new int[n];

		for (i = 0; i < n; i++)
			msis[i] = arr[i];

		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && msis[i] < msis[j] + arr[i])
					msis[i] = msis[j] + arr[i];

		for (i = 0; i < n; i++)
			if (max < msis[i])
				max = msis[i];

		return max;
	}

}
