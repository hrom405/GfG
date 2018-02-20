package com.gfg_programs;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
	}

	static int check(int n) {
		int sum = 0;
		int a = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
			if (sum == n) {
				a = 1;
				break;
			}
		}
		if (a == 1)
			return a;
		else
			return a;
	}

}
