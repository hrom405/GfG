package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number/0*/
import java.util.Scanner;

public class SumOfAllSubstringsOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String s = String.valueOf(n);
			System.out.println(check(s));
		}
	}

	private static int check(String s) {
		int sum = 0;
		StringBuilder sb;
		for (int i = 0; i < s.length(); i++) {
			sb = new StringBuilder();
			for (int j = i; j < s.length(); j++) {
				sb.append(s.charAt(j));
				sum += Integer.valueOf(sb.toString());
			}
		}
		return sum;
	}

}
