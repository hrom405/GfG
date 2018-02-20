package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/n-divisors/0/?ref=self*/
import java.util.Scanner;

public class NDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int d = 0;
			for (int i = a; i <= b; i++) {
				if (check(i) == n) {
					d++;
				}
			}
			System.out.println(d);
		}
	}

	public static int check(int n) {
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}
