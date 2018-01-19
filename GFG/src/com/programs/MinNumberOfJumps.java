package com.programs;

/*https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps/0/?ref=self*/
import java.util.Scanner;

public class MinNumberOfJumps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int last = a[n - 1];
			int cnt = 0;
			boolean h = false;
			int i = 0;
			while (i != n - 1 && i < n) {
				cnt++;
				i += a[i];
			}
			System.out.println(cnt);
		}
	}
}
