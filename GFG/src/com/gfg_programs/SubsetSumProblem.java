package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/subset-sum-problem/0/?ref=self*/
import java.util.Scanner;

public class SubsetSumProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			if (sum % 2 == 1)
				System.out.println("NO");
			else {
				boolean check[][] = new boolean[n][(sum / 2) + 1];
				for (int j = 0; j <= (sum / 2); j++) {
					if (a[0] == j)
						check[0][j] = true;
					else
						check[0][j] = false;
				}
				for (int j = 0; j < n; j++) {
					check[j][0] = true;
				}
				for (int j = 1; j < n; j++) {
					for (int k = 1; k < (sum / 2) + 1; k++) {
						if (check[j - 1][k] == true)
							check[j][k] = check[j - 1][k];
						else {
							if (k - a[j] >= 0) {
								check[j][k] = check[j - 1][k - a[j]];
							}
						}
					}
				}
				if (check[n - 1][(sum / 2)] == true)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
