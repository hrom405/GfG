package com.programs;

/*https://practice.geeksforgeeks.org/problems/sum-of-divisors/0*/
import java.util.Scanner;

public class SumOfDivisors {

	public static int divSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(divSum(n));
		}
	}

}
