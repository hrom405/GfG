package com.programs;

/*https://practice.geeksforgeeks.org/problems/efficiently-sorting-number-from-0-to-n2-1/0/?ref=self*/
import java.util.Arrays;
import java.util.Scanner;

public class EfficientlySortingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}

			Arrays.sort(a);
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}
}
