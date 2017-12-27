package com.programs;

/*/*https://practice.geeksforgeeks.org/problems/part-sort/0/?ref=self*/
import java.util.Scanner;

public class PartSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++)
				a[i] = sc.nextInt();
			int low = sc.nextInt();
			int high = sc.nextInt();
			if (low > high) {
				int temp = low;
				low = high;
				high = temp;
			}
			check(a, low, high);
		}
	}

	private static void check(int[] a, int low, int high) {
		for (int i = low; i <= high; i++) {
			for (int j = i + 1; j <= high; j++) {
				System.out.println("a[i]-->" + a[i] + "\ta[j]-->" + a[i + 1]);
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
}
