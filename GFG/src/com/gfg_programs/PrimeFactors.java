package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/prime-factors/0/?ref=self*/
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++)
				if (n % i == 0 && isPrime(i))
					System.out.print(i + " ");

			System.out.println();
		}
	}

	public static boolean isPrime(int i) {
		// System.out.println(i);
		int factors = 0;
		int j = 1;

		while (j <= i) {
			if (i % j == 0)
				factors++;
			j++;
		}
		return (factors == 2);
	}
}
