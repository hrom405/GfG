package com.programs;

/*https://practice.geeksforgeeks.org/problems/count-the-elements/0/?ref=self*/
import java.util.Scanner;

public class CountTheElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				cnt = 0;
				for (int j = 0; j < n; j++) {
					if (b[j] <= a[i]) {
						cnt++;
					}
				}
				c[i] = cnt;
			}
			for (int i = 0; i < c.length; i++) {
				if (i == n - 1) {
					System.out.print(c[i]);
				} else
					System.out.print(c[i] + ",");
			}
			System.out.println();
		}
	}
}
