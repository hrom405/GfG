package com.programs;
/*Given an array of n distinct elements.
 *  Find the length of shortest unordered (neither increasing nor decreasing) 
 *  sub array in given array.*/

import java.util.Scanner;

public class ShortestUnorderedSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(check(a));
		}
	}

	private static int check(int[] a) {
		int p = 2;
		if (a.length < 3)
			return 0;	
		else {
			for (int i = 1; i < a.length - 1; i++) {
				if (a[i - 1] < a[i] && a[i + 1] < a[i]) {
					p = 3;
					break;
				}
			}
			if (p == 3)
				return 3;
			else
				return 0;
		}
	}
}
