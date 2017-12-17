package com.programs;
/*Given N, print all N digit numbers in increasing order, such that their digits are in strictly increasing order(from left to right).*/
import java.util.Scanner;

public class NDigitNoWithDigitsInIncreasingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long num1 = (long) Math.pow(10, n - 1);
			long num2 = (long) Math.pow(10, n);

			for (long i = num1; i < num2; i++)
				if (check(i, n) != 0)
					System.out.print(check(i, n) + " ");
			System.out.println();
		}
	}
	private static long check(long i, int n) {
		long res = 0;
		for (int j = 0; j < n; j++)
			if (i % 10 > check(i / 10, n - 1))
				res = i;
		return res;
	}

}
