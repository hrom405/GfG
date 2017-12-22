package com.programs;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n + m];

			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			reverse(a);
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}

	public static int[] reverse(int[] data) {
		for (int left = 0, right = data.length - 1; left < right; left++, right--) {
			int temp = data[left];
			data[left] = data[right];
			data[right] = temp;
		}
		return data;
	}
}
