package com.programs;

/*https://practice.geeksforgeeks.org/problems/transform-the-array/0/?ref=self*/
import java.util.Scanner;

public class TransformTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int flag = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				if (i != 0 && a[i] == a[flag]) {
					a[flag] *= 2;
					a[i] = 0;
				} else if (i != 0 && a[i] != 0) {
					flag = i;
				}
			}
			int zero = 0;
			for (int j = 0; j < n; j++) {
				if (a[j] != 0)
					System.out.print(a[j] + " ");
				else
					zero++;
			}
			for (int i = 0; i < zero; i++)
				System.out.print("0 ");

			System.out.println();
		}
	}
}
