package com.programs;

/*https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product/0*/
import java.util.Arrays;
import java.util.Scanner;

public class MinimizeSumOfProducts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			for (int i = 0; i < n; i++)
				b[i] = sc.nextInt();

			Arrays.sort(a);
			Arrays.sort(b);

			int sum = 0;
			int k = n - 1;

			for (int i = 0; i < n; i++) {
				sum += a[i] * b[k - i];
			}
			System.out.println(sum);
		}
	}

}
