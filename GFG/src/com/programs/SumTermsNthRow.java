package com.programs;

/*https://practice.geeksforgeeks.org/problems/sum-terms-nth-row/0*/
import java.util.Scanner;

public class SumTermsNthRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int sum = 0;
			int a = (n * (n - 1)) + 1;
			for (int i = a; i < a + (n * 2); i++) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}
