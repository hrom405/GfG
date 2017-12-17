package com.programs;

import java.util.Scanner;

class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String b = sc.next();
			long a = Integer.valueOf(b);
			System.out.println(b2d(a));
		}
	}

	public static int b2d(long binary) {
		int decimal = 0;
		int power = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				long temp = binary % 10;
				decimal += temp * Math.pow(2, power);
				binary = binary / 10;
				power++;
			}
		}
		return decimal;
	}
}