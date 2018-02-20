package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/narcissistic-number/0/?ref=self*/
import java.util.Scanner;

public class NarcissisticNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int sum = 0;
			String s = String.valueOf(n);
			int len = s.length();
			for (int i = 0; i < len; i++) {
				sum += Math.pow(s.charAt(i) - '0', len);
			}
			if (sum == n)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
