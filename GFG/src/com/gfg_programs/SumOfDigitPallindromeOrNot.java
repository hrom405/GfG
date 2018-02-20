package com.gfg_programs;
/*Write a program to check if the sum of digits of a given number is palindrome number or not.*/
import java.util.Scanner;

public class SumOfDigitPallindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
	}

	private static String check(int n) {
		int len = String.valueOf(n).length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += n % 10;
			n /= 10;
		}
		if (palin(String.valueOf(sum)) == true)
			return "YES";
		else
			return "NO";
	}

	public static boolean palin(String s) {
		String reverse = new StringBuffer(s).reverse().toString();

		if (s.equals(reverse))
			return true;

		else
			return false;
	}
}
