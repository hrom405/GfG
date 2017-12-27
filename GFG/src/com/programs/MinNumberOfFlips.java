package com.programs;

/*https://practice.geeksforgeeks.org/problems/min-number-of-flips/0/?ref=self*/
import java.util.Scanner;

public class MinNumberOfFlips {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int min1 = check(s, '1');
			int min0 = check(s, '0');

			if (min1 < min0) {
				System.out.println(min1);
			} else
				System.out.println(min0);

		}
	}

	private static int check(String s, char c) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				if (s.charAt(i) != c) {
					cnt++;
				}
			}
			if (i % 2 == 1) {
				if (s.charAt(i) == c) {
					cnt++;
				}
			}
		}

		return cnt;
	}
}
