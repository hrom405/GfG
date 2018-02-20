package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/number-of-divisors-in-a-given-range/0*/
import java.util.Scanner;

public class NumberOfDivisorsInGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cnt = 0;
			for (int i = m; i <= n; i++)
				if (i % a == 0 || i % b == 0)
					cnt++;

			System.out.println(cnt);
		}
	}
}
