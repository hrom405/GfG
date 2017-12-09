package com.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class LargestNumberFormedFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			String arr[] = new String[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.next();

			Arrays.sort(arr, new Comparator<String>() {
				public int compare(String x, String y) {
					int a = Integer.parseInt(x + y);
					int b = Integer.parseInt(y + x);
					return a > b ? -1 : 1;
				}
			});
			for (int i = 0; i < n; i++)
				System.out.print(arr[i]);
			System.out.println("");
		}
	}
}