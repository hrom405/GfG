package com.programs;

/*https://practice.geeksforgeeks.org/problems/product-sum/0/?ref=self*/
import java.util.Scanner;

public class ProductSumFormulaApproach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(countDigits(a, b));
		}
	}

	public static int countDigits(int a, int b) {
		if (a == 0 || b == 0)
			return 1;
		return (int) Math.floor(Math.log10(Math.abs(a)) + Math.log10(Math.abs(b))) + 1;
	}
}