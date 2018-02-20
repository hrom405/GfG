package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/sum-of-product-of-all-pairs/0/?ref=self*/
import java.util.Scanner;

public class SumOfProductsOfAllPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int sum = 0;

			for (int i = 0; i < a.length; i++)
				a[i] = sc.nextInt();

			for (int i = 0; i < a.length; i++)
				for (int j = i + 1; j < a.length; j++)
					sum += a[i] * a[j];

			System.out.println(sum);
		}
	}

}
