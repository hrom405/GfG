package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/interesting-patterns/0/?ref=self*/
import java.util.Scanner;

public class InterestingPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			check(n);
		}
	}

	public static void check(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				System.out.print(1 + Math.max(Math.abs(n - i - 1), Math.abs(n - j - 1)));
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
