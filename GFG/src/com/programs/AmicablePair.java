package com.programs;

/*https://practice.geeksforgeeks.org/problems/amicable-pair/0*/
import java.util.Scanner;

public class AmicablePair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if (n1 == check(n2) && n2 == check(n1))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

	private static int check(int n2) {
		int sum = 0;
		for (int i = 1; i < n2; i++) {
			if (n2 % i == 0)
				sum += i;
		}
		return sum;
	}
}
