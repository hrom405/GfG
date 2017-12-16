package com.programs;

import java.util.Scanner;

/*Find the first repeating element in an array of integers,
 *  i.e., an element that occurs more than once and whose index of first occurrence is smallest.*/
public class FirstRepeatingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			check(a, n);
		}
	}

	public static void check(int[] arr, int len) {
		int result = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					result = i + 1;
					System.out.println(result);
					return;
				}
			}
		}
		System.out.println(-1);
	}
}
