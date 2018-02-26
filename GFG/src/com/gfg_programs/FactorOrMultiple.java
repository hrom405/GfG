package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/factor-or-multiple/0*/
import java.util.Scanner;

public class FactorOrMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int X = 0;
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
				if (a[j] % k == 0)
					X = X | a[j];
			}
			System.out.println(X);
		}
	}
}
