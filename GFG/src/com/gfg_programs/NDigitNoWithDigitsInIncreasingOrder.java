package com.gfg_programs;

/*Given N, print all N digit numbers in increasing order, such that their digits are in strictly increasing order(from left to right).*/

import java.util.Scanner;

public class NDigitNoWithDigitsInIncreasingOrder {

	public static void print(int n, int seq[], int l, int dig) {
		if (l == 0) {
			for (int d : seq) {
				System.out.print(d);
			}
			System.out.print(" ");
			return;
		}
		for (int i = n + 1; i <= 9; i++) {
			seq[dig] = i;
			print(i, seq, l - 1, dig + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			print(0, new int[N], N, 0);
			System.out.println();
		}
	}

}
