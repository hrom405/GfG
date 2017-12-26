package com.programs;

/*https://practice.geeksforgeeks.org/problems/find-x/0/?ref=self*/
import java.util.Scanner;

public class FindX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int count = 0;
			if (n < 10) {
				if (n % 3 == 0) {
					count++;
				}
			} else {
				for (int i = n; i >= n - 42; i--) {
					if (i + S(F(i)) + S(F(S(F(i)))) == n) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	private static int F(int x) {
		int f = 1;
		if (x == 0) {
			return x;
		} else {
			while (x > 0) {
				f *= x % 10;
				x /= 10;
			}
			return f;
		}
	}

	private static int S(int a) {
		int sum = 0;
		while (a > 0) {
			sum += a % 10;
			a /= 10;
		}
		return sum;
	}
}
