package com.programs;

import java.util.Scanner;

public class TwosCompliment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			System.out.println(check(s));
		}
	}

	private static String check(String s) {
		int n = s.length();
		char[] a = s.toCharArray();
		// System.out.println(Arrays.toString(a));
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == '1') {
				while (i-- != 0) {
					// System.out.println("char at position " + i + " is:" + a[i]);
					if (a[i] == '1') {
						a[i] = '0';
					} else
						a[i] = '1';
				}
			}
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			builder.append(a[i]);
		}
		return builder.toString();
	}

}
