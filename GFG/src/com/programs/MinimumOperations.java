package com.programs;

/*https://practice.geeksforgeeks.org/problems/find-optimum-operation/0*/
import java.util.Scanner;

public class MinimumOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
	}

	public static int check(int num) {

		if (num == 0)
			return 0;

		if (num == 1)
			return 1;

		if (num % 2 == 0)
			return 1 + check(num / 2);

		return 1 + check(num - 1);
	}
}
