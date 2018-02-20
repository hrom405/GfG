package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/remainder-of-array-multiplication/0/?ref=self*/
import java.util.Scanner;

public class RemainderOfArayMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long[] a = new long[n];

			long res = 1;
			for (int i = 0; i < n; i++) {
				long number = sc.nextLong();
				a[i] = number;
			}
			int k = sc.nextInt();

			for (int i = 0; i < a.length; i++) {
				res *= a[i] % k;
			}
			System.out.println(res % k);
		}
	}
}
