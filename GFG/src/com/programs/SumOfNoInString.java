package com.programs;

import java.util.Scanner;

public class SumOfNoInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			System.out.println(check(s));
		}
	}
	private static int check(String s) {
		int sum = 0;
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3'
					|| s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7'
					|| s.charAt(i) == '8' || s.charAt(i) == '9') {
				// System.out.println(i + " " + s.charAt(i));
				b.append(s.charAt(i));
				// System.out.println(b.toString());
			} else {
				if (b.toString().length() > 0) {
					sum += Integer.valueOf(b.toString());
					// System.out.println("sum:" + sum);
					b = new StringBuilder();
				}
			}
		}
		if (b.toString().length() > 0) {
			sum += Integer.valueOf(b.toString());
		}

		return sum;
	}

}
