package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/number-of-subarrays-with-maximum-values-in-given-range/0/?ref=self*/
import java.util.Scanner;

public class NumberOfSubarraysWithMaxValuesInGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int l = sc.nextInt();
			int r = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(countSubarrays(a, n, l, r));
		}
	}

	public static long countSubarrys(long n) {
		return n * (n + 1) / 2;
	}

	public static long countSubarrays(int a[], int n, int L, int R) {
		long res = 0;
		long exc = 0, inc = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] > R) {
				res += (countSubarrys(inc) - countSubarrys(exc));
				inc = 0;
				exc = 0;
			} else if (a[i] < L) {
				exc++;
				inc++;
			} else {
				res -= countSubarrys(exc);
				exc = 0;
				inc++;
			}
		}
		res += (countSubarrys(inc) - countSubarrys(exc));
		return res;
	}
}
