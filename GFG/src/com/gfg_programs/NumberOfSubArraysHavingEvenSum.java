package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/find-the-number-of-sub-arrays-having-even-sum/0/?ref=self*/
import java.util.Scanner;

public class NumberOfSubArraysHavingEvenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int even = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				if (a[i] % 2 == 0)
					even++;
			}
			int sum;
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {
				sum = a[i];

				for (int j = i + 1; j < a.length; j++) {
					sum += a[j];
					if (sum % 2 == 0) {
						// System.out.println("i-->" + i + "\tj-->" + j + "\tSum-->" + sum);
						cnt++;
					}
				}
			}
			System.out.println(cnt + even);
		}

	}

}
