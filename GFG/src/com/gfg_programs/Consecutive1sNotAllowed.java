package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed/0/?ref=self*/
import java.math.BigInteger;
import java.util.Scanner;

public class Consecutive1sNotAllowed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger[] a = new BigInteger[101];
		a[0] = BigInteger.valueOf(1);
		a[1] = BigInteger.valueOf(2);
		for (int i = 2; i <= 100; i++) {
			a[i] = a[i - 1].add(a[i - 2]);
		}
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(a[n].mod(new BigInteger("1000000007")));
		}
	}

}
