package com.programs;

import java.util.Scanner;

public class GFG {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int num = sc.nextInt();
			check(num);
			//System.out.println();
		}
	}

	private static void check(int num) {
		int abc;
		for (int i = 3; i < num; i++) {
			if (isPrimeNumber(i)) {
				for (int j = 3; j < num; j++) {
					abc = 0;
					if (isPrimeNumber(j)) {
						abc = i + j;
						if (abc == num) {
							System.out.println(i + " " + j);
							break;
						}
					}
				}
			}
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