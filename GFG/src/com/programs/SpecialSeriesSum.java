package com.programs;

/*https://practice.geeksforgeeks.org/problems/special-series-sum/0*/
import java.util.Scanner;

public class SpecialSeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println((n * (n + 1) * (2 * n + 4)) / 12);
		}
	}
}
