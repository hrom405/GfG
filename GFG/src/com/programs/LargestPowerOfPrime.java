package com.programs;
/*https://practice.geeksforgeeks.org/problems/largest-power-of-prime/0/?ref=self*/
import java.math.BigInteger;
import java.util.Scanner;

public class LargestPowerOfPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int max = 0;
			BigInteger base = new BigInteger(k+"");
			BigInteger s = fact(n);
			//System.out.println(s);
			for (int i = 0; i < 5000; i++) {
				if (s.mod(base.pow(i)) == BigInteger.ZERO) {
					if (max < i) {
						max = i;
					}
				}
			}
			System.out.println(max);
		}
	}

	public static BigInteger fact(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}

		return fact;
	}
}
