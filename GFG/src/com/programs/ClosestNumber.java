package com.programs;

/*https://practice.geeksforgeeks.org/problems/closest-number/0/?ref=self*/
import java.util.Scanner;

public class ClosestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(closestNumber(n, m));
		}
	}
	public static int closestNumber(int n, int m) {
		int q = n / m;
		System.out.println(q);
		// 1st possible closest number
		int n1 = m * q;
		// 2nd possible closest number
		int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));

		if (Math.abs(n - n1) < Math.abs(n - n2))
			return n1;
		return n2;
	}
}
