package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/find-smallest-values-of-x-and-y-such-that-ax-by-0/0*/
import java.util.Scanner;

public class FindSmallestValueOfxAndy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int gcd = gcd(a, b);
			System.out.println(b / gcd + " " + a / gcd);
		}
	}

	private static int gcd(int a, int b) {
		int gcd = 0;
		for (int i = 1; i <= a && i <= b; ++i) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		return gcd;
	}
}
