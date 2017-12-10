package com.programs;

import java.util.Scanner;

public class ReachAGivenScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int k = sc.nextInt();
			System.out.println(ways(k));
		}
	}

	public static int ways(int n) {
		int table[] = new int[n + 1];
		table[0] = 1;
		int i;
		for (i = 3; i <= n; i++)
			table[i] += table[i - 3];
		for (i = 5; i <= n; i++)
			table[i] += table[i - 5];
		for (i = 10; i <= n; i++)
			table[i] += table[i - 10];

		return table[n];
	}
}
