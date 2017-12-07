package com.programs;

import java.util.Scanner;

public class GFG {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int p = 0, q = 0, f = 0;
		while (T-- > 0) {
			int num = sc.nextInt();
			for (int i = 3; i <= num; i++) {
				if (isPrimeNumber(i)) {
					p = num - i;
					if (isPrimeNumber(p)) {
						q = i;
						f = 1;
						break;
					} else {
						continue;
					}
				}
			}
			if (f == 1)
				System.out.println(q + " " + p);
		}
	}

	public static boolean isPrimeNumber(int i) {
		int factors = 0;
		int j = 1;

		while (j <= i) {
			if (i % j == 0) {
				factors++;
			}
			j++;
		}
		return (factors == 2);
	}
}