package com.gfg_programs;
/*https://practice.geeksforgeeks.org/problems/form-a-number-divisible-by-3-using-array-digits/0*/
import java.util.Scanner;

public class FormANumberDivisibleBy3UsingArrayelements {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			cnt = 0;
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				check(a[i]);
			}

			if (cnt % 3 == 0)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

	private static void check(int i) {
		String str = String.valueOf(i);
		for (int i1 = 0; i1 < str.length(); i1++) {
			cnt += Integer.valueOf(str.charAt(i1)) - 48;
		}
	}
}
