package com.programs;

/*https://practice.geeksforgeeks.org/problems/number-of-factors/0/?ref=self*/
import java.util.Scanner;

public class NumberOfFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int cnt = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
