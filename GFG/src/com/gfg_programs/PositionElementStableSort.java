package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/stable-sort-and-position/0/?ref=self*/
import java.util.Scanner;

public class PositionElementStableSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println(check(a, k));

		}
	}

	private static int check(int[] a, int k) {
		int num = a[k];
		int pos = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < num) {
				pos++;
			}
		}
		for (int i = 0; i < k; i++) {
			if (a[i] == num) {
				pos++;
			}
		}

		return pos;
	}

}
