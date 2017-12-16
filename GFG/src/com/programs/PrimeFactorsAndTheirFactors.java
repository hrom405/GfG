package com.programs;
/*Given a number N, print all its unique prime factors and their powers in N.*/
import java.util.Scanner;

public class PrimeFactorsAndTheirFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int t = n;
			int[] a = new int[t + 1];
			for (int i = 2; i <= t; i++) {
				while (n % i == 0 && n >= 2) {
					a[i] += 1;
					n /= i;
				}
			}
			for (int i = 0; i <= t; i++) {
				if (a[i] > 0) {
					System.out.print(i + " " + a[i] + " ");
				}
			}
			System.out.println();
		}
	}
}