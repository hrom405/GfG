package com.programs;

/*Given N, print all N digit numbers in increasing order, such that their digits are in strictly increasing order(from left to right).*/

import java.util.Scanner;

public class NDigitNoWithDigitsInIncreasingOrder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long start = (long) Math.pow(10, n - 1);
			long end = (long) Math.pow(10, n);

			for (long current = start; current < end; current++) {
				if (check(current, n)) {
					System.out.print(current + " ");
				}
			}
			System.out.println();
		}
	}

	private static boolean check(long current, int limit) {

		long unitPlace = current % 10;
		current = current / 10;
		boolean status = true;
		for (int i = 0; i < limit; i++) {
			long upcommingDigit = current % 10;
			// System.err.println("upcommingDigit : "+nextDigit);
			// System.err.println("unitPlace : "+unitPlace);
			if (upcommingDigit < unitPlace) {

			} else {
				status = false;
			}

			unitPlace = upcommingDigit;
			current = current / 10;
		}

		return status;
	}

}