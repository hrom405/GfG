package com.programs;

/*https://practice.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k/0*/
import java.util.Scanner;

public class LongestSubArrayWithSumDivisibleByK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++)
				a[i] = sc.nextInt() % k;

			int sum = 0;
			int len = 0;
			for (int i = 0; i < n; i++) {
				if (len > n - i)
					break;
				sum = 0;
				for (int j = i; j < n; j++) {
					sum += a[j];
					// System.out.println(sum);
					if (sum % k == 0) {
						if (len <= j - i) {
							len = j - i + 1;
						}
					}
				}
			}
			System.out.println(len);
		}
	}
}
