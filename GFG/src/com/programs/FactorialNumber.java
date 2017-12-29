package com.programs;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			if (check(n))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

	private static boolean check(int n) {
		boolean isFact = false;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				n/=i;
				isFact = true;
			} else {
				isFact = false;
				break;
			}
		}
		return isFact;
	}
}
