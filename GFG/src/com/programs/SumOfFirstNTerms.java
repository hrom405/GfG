package com.programs;

/*https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms/0/?ref=self*/
import java.util.Scanner;

public class SumOfFirstNTerms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum = 0;
		while (t-- > 0) {
			sum = 0;
			long n = sc.nextInt();
			long m = ((n * (n + 1) / 2) % 1000000007);
			sum += (m * m) % 1000000007;
			System.out.println(sum);
		}
	}
}
