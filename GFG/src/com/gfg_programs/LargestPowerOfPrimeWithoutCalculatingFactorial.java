package com.gfg_programs;
/*https://practice.geeksforgeeks.org/problems/largest-power-of-prime/0/?ref=self*/

import java.util.Scanner;

//Used Legendre's Formula
public class LargestPowerOfPrimeWithoutCalculatingFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int ans = 0;

			while (n > 0) {
				n /= k;
				ans += n;
			}
			System.out.println(ans);
		}
	}
}
