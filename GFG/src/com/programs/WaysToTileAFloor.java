package com.programs;

import java.util.Scanner;

public class WaysToTileAFloor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int W = sc.nextInt();
			generate(W);

		}
	}

	public static void generate(int value) {
		long[] count = new long[value + 1];
		count[0] = 1;
		count[1] = 1;
		for (int i = 2; i <= value; i++) {
			count[i] = count[i - 1] + count[i - 2];
		}
		System.out.println(count[value]);
	}
}
