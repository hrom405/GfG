package com.programs;

import java.util.Scanner;

class NumbersWithAlternative1s {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			for (int i = 1; i < Math.pow(2, N); i++) {
				String s = Integer.toBinaryString(i);
				if (check(s) == false)
					System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static boolean check(String str) {
		boolean hai = false;
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1) {
				if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
					hai = true;
					break;
				}
			}
			if (hai == true)
				break;
		}
		return hai;
	}
}