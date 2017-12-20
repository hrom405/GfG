package com.programs;

import java.util.Scanner;

public class LongestEvenLengthSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			System.out.println(check(s));
		}
	}

	static int check(String str) {
		int n = str.length();
		int maxlen = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j += 2) {
				int length = j - i + 1;
				int leftsum = 0, rightsum = 0;
				for (int k = 0; k < length / 2; k++) {
					leftsum += (str.charAt(i + k) - '0');
					rightsum += (str.charAt(i + k + length / 2) - '0');
				}
				if (leftsum == rightsum && maxlen < length)
					maxlen = length;
			}
		}
		return maxlen;
	}
}
