package com.programs;

import java.util.Scanner;

public class RightAngledTriangle {

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();

			if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}
}
