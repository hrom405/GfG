package com.programs;

/*https://practice.geeksforgeeks.org/problems/total-count/0/?ref=self*/
import java.util.Scanner;

public class TotalCount {
	public static int k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			k = sc.nextInt();
			// int[] a = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int num = sc.nextInt();
				sum += check(num);
			}
			System.out.println(sum);
		}
	}

	public static int check(int num) {
		int n = 0;
		while (num > 0) {
			n++;
			num -= k;
		}
		return n;
	}
}
