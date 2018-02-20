package com.gfg_programs;

/**https://practice.geeksforgeeks.org/problems/largest-sum-of-digits-in-all-divisors/0/?ref=self*/
import java.util.Scanner;

public class LargestSumOfDigitsInAllDivisors {
	static int maxSum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			maxSum = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					String s = String.valueOf(i);
					if (check(s) > maxSum) {
						maxSum = check(s);
					}
				}
			}
			System.out.println(maxSum);
		}
	}

	private static int check(String s) {
		// System.err.println("num=>"+s);
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			cnt += (Integer.valueOf(s.charAt(i)) - 48);
		}
		// System.out.println("Cnt==>" + cnt);
		return cnt;
	}
}
