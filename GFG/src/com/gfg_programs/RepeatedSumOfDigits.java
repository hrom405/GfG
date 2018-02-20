package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/repeated-sum-of-digits/0/?ref=self*/
import java.util.Scanner;

public class RepeatedSumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
	}

	public static int check(int n) {
		int n1 = 0;
		if (n < 10)
			return n;
		else {
			String num = String.valueOf(n);
			for (int i = 0; i < num.length(); i++) {
				n1 += Integer.valueOf(num.charAt(i) - '0');
			}
			return check(n1);
		}
	}
}
