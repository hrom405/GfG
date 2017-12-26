package com.programs;

/*https://practice.geeksforgeeks.org/problems/special-odd-series-sum/0*/
import java.util.Scanner;

public class SpecialOddSeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[1000];
		int sum = 0;
		a[0] = 1;
		int k = 3;
		for (int i = 1; i < 1000; i++) {
			a[i] = a[i - 1] + k;
			k += 2;
		}
		// System.out.println(Arrays.toString(a));
		int t = sc.nextInt();
		while (t-- > 0) {
			sum = 0;
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				sum += a[i];
			}
			System.out.println(sum);
		}
	}
}
