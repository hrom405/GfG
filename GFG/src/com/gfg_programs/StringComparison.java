package com.gfg_programs;

import java.util.Scanner;
//count the whole string cost

public class StringComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s1 = sc.next();
			String s2 = sc.next();
			check(s1, s2);
		}
	}

	public static void check(String a, String b) {
		if (a.equals(b)) {
			System.out.println(0);
			return;
		}
		int m = a.length(), n = b.length();
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (a.charAt(i) != b.charAt(j)) {
				System.out.println(a.charAt(i) > b.charAt(j) ? 1 : -1);
				return;
			} else if (a.charAt(i) == 'n') {
				if (i < m - 1 && j < n - 1) {
					if (a.charAt(i + 1) == 'g' && b.charAt(j + 1) == 'g') {
						i += 2;
						j += 2;
					} else if (a.charAt(i + 1) != 'g' && b.charAt(j + 1) != 'g') {
						i++;
						j++;
					} else if (a.charAt(i + 1) == 'g' || b.charAt(j + 1) == 'g') {
						System.out.println(b.charAt(j + 1) == 'g' ? -1 : 1);
						return;
					}
				} else if (i == m - 1 && j == n - 1) {
					System.out.println(0);
					return;
				} else if (i == m - 1 || j == n - 1) {
					System.out.println(i == m - 1 ? -1 : 1);
					return;
				}
			} else {
				i++;
				j++;
			}
		}
		System.out.println(i == m ? -1 : 1);
	}
}
