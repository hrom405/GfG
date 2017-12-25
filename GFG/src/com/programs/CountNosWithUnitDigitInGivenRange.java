package com.programs;

import java.util.Scanner;

public class CountNosWithUnitDigitInGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int low = sc.nextInt();
			int high = sc.nextInt();
			int k = sc.nextInt();

			System.out.println(check(low, high, k));

		}
	}

	private static int check(int low, int high, int k) {
		int cnt = 0;
		for (int i = low; i <= high; i++) {
			if (i % 10 == k) {
				cnt++;
			}
		}
		return cnt;
	}

}
