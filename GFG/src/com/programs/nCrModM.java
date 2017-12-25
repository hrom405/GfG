package com.programs;

/*https://practice.geeksforgeeks.org/problems/ncr-mod-m-part-1/0/?ref=self*/
import java.util.Scanner;

public class nCrModM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			int m = sc.nextInt();
			long sum = 0;
			if (r == n) {
				sum = 1;
			} else
				sum = fact(n, n - r, r);
			System.out.println(sum % m);
		}
	}

	static long fact(int num, int j, int k) {
		long result = 1;
		if (j == 0)
			return result;
		else {
			for (int i = j + 1; i <= num; i++) {
				result *= i;
			}
			try {
				result /= fact(k);

			} catch (ArithmeticException e) {
			}
			return result;
		}
	}

	static long fact(int num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}