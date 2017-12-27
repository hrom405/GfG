package com.programs;

/*https://practice.geeksforgeeks.org/problems/the-mighty-divisible-number/0/?ref=self*/
import java.util.Scanner;

public class MightyDivisibleNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			int N = sc.nextInt();
			long n = 1;
			long k = N;
			while (--N > 0)
				n *= 10;
			long count = 0;
			long lcm = findLcm(findLcm(X, Y), Z);
			String l = Long.toString(lcm);
			if ((l.length()) > k) {
				System.out.println(-1);
			} else {
				if ((n % lcm) == 0) {
					System.out.println(n);
				} else {
					System.out.println(n + lcm - (n % lcm));
				}
			}
		}
	}

	public static long findLcm(long x, long y) {
		long s = 0, t = 0;
		for (long i = 1;; i++) {
			s = i * x;
			for (long z = 1; t < s; z++) {
				t = y * z;
			}
			if (s == t)
				break;
		}
		return (s);
	}
}
