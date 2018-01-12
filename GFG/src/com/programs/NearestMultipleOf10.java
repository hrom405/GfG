package com.programs;

import java.util.Scanner;

public class NearestMultipleOf10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
	}

	static int check(int n) {
		int a = (n / 10) * 10;
		int b = a + 10;
		return (n - a > b - n) ? b : a;
	}
}
