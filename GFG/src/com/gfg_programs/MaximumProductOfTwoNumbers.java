package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/maximum-product-of-two-numbers/0/?ref=self*/
import java.util.Scanner;

public class MaximumProductOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++)
				a[i] = sc.nextInt();
			int max = 0, pro = 0;
			for (int i = 0; i < a.length - 1; i++) {
				int num = a[i];
				for (int j = i + 1; j < a.length; j++) {
					pro = num * a[j];
					if (pro > max)
						max = pro;
				}
			}
			System.out.println(max);
		}
	}
}
