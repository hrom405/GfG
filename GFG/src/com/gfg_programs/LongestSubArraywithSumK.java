package com.gfg_programs;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArraywithSumK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int k = sc.nextInt();
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			check(a, n, k);
		}
	}

	public static void check(int arr[], int n, int k) {
		HashMap<Integer, Integer> hm = new HashMap();
		int sum = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum == k) {
				max = Math.max(max, i + 1);
			}

			int diff = sum - k;

			if (hm.containsKey(diff)) {
				max = Math.max(max, i - hm.get(diff));
			}

			if (!hm.containsKey(sum)) {
				hm.put(sum, i);
			}
		}
		System.out.println(max);
	}
}
