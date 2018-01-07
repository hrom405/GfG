package com.programs;

/*https://practice.geeksforgeeks.org/problems/reverse-array-in-groups/0/?ref=self*/
import java.util.Scanner;

public class ReverseArraysInGroup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();

			for (int i = 0; i < n; i += k) {
				int left = i;
				int right = Math.min(i + k - 1, n - 1);

				while (left < right) {
					int temp = a[left];
					a[left] = a[right];
					a[right] = temp;

					left++;
					right--;
				}
			}
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();

		}

	}
}
