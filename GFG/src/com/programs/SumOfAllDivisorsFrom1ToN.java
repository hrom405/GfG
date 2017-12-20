package com.programs;

import java.util.Scanner;

public class SumOfAllDivisorsFrom1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(divisorSum(n));
		}
	}

	static long divisorSum(int n) {
		long sum = 0;
		for (int i = 1; i <= n; ++i) {
			//System.out.println(i);
			sum += (n / i) * i;
		}
		return sum;
	}

}
