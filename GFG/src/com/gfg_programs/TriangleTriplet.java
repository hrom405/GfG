package com.gfg_programs;

import java.util.Arrays;

public class TriangleTriplet {

	public int triangleTriplet(int a[]) {
		int n = a.length;
		// Arrays.sort(a);
		int num = 0;
		rvereseArray(a, 0, a.length - 1);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; j < n; j++) {
					if (i != j && j != k && i != k) {
						// System.out.println("i-->" + i + "\tj-->" + j + "\tk-->" + k);
						if (a[i] + a[j] > a[k] && a[j] + a[k] > a[i] && a[i] + a[k] > a[j]) {
							/*
							 * System.out.println(a[i] + " " + a[j] + " " + a[k]); System.out.println(a[i] +
							 * a[j] + a[k]);
							 */
							num = Integer.max(num, a[i] + a[j] + a[k]);
						}
					}
				}
			}
		}
		return num;
	}

	static void rvereseArray(int arr[], int start, int end) {
		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		rvereseArray(arr, start + 1, end - 1);
	}

	public static void main(String[] args) {
		// int a[] = { 9, 8, 7, 10, 11 };
		int a[] = { 1, 1, 3 };
		Arrays.sort(a);
		System.out.println(new TriangleTriplet().triangleTriplet(a));
	}
}
