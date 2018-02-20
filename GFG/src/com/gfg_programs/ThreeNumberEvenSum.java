package com.gfg_programs;
/*https://practice.geeksforgeeks.org/problems/three-number-even-sum/0/?ref=self*/

import java.util.Scanner;

public class ThreeNumberEvenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long odd = 0;
			long even = 0;
			if (n % 2 == 0) {
				odd = n / 2;
				even = n / 2;
			} else {
				even = n / 2;
				odd = even + 1;
			}
			long sum = (even * (even - 1) * (even - 2) / 6) + (even * odd * (odd - 1) / 2);
			System.out.println(sum % 1000000007);
		}
	}
}
