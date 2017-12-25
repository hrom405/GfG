package com.programs;

import java.util.Scanner;

/*https://practice.geeksforgeeks.org/problems/number-of-unique-paths/0*/
public class NumberOfUniquePaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long div = 0;
			long sum = 0, ans = 0;
			// c = a + b - 2;
			sum = fact(a + b - 2, b - 1, a - 1);
			// div = fact(a - 1) * fact(b - 1);
			// ans = sum / div;
			System.out.println(sum);
			// System.out.println(div);

		}
	}

	static long fact(int num, int j, int k) {
		long result = 1;
		for (int i = j + 1; i <= num; i++) {
			result *= i;
		}
		// System.out.println(num + ":" + result);
		result /= fact(k);
		// System.out.println("result: " + result);
		return result;
	}

	static long fact(int num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		// System.out.println(num + ":" + result);
		return result;
	}

}
