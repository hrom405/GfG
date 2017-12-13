package com.programs;

import java.util.Scanner;

/*A Padovan Sequence is a sequence which is represented by the following recurrence
P(n) = P(n-2) + P(n-3)
P(0) = P(1) = P(2) = 1
Now given a number N your task is to find the Nth no in this sequence.*/

public class PadovanSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int k = sc.nextInt();
			System.out.println(padovan(k));
		}
	}

	private static int padovan(int k) {
		long[] a = new long[k + 1];
		a[0] = 1;
		a[1] = 1;
		a[2] = 1;
		for (int i = 3; i <= k; i++)
			a[i] = a[i - 2] + a[i - 3];

		return (int) (a[k] % 1000000007);
	}

}
