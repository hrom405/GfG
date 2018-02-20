package com.gfg_programs;

import java.util.Scanner;

/*Consider an array with n elements and value of all the elements is zero. We can perform following operations on the array.

 1. Incremental operations: Choose 1 element from the array and increment its value by 1.
 2. Doubling operation: Double the values of all the elements of array.

Given an array of integers of size N. Print the smallest possible number of operations needed to change the array from all zeros to desired array.*/

public class MinimumStepsToGetDesiredArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(countMinOperations(a, a.length));
		}
	}

	static int countMinOperations(int[] arr, int n) {
		int result = 0;

		while (true) {
			int zero_count = 0;

			int i;
			for (i = 0; i < n; i++) {
				if (arr[i] % 2 == 1)
					break;

				else if (arr[i] == 0)
					zero_count++;
			}

			if (zero_count == n)
				return result;

			if (i == n) {
				for (int j = 0; j < n; j++)
					arr[j] /= 2;
				result++;
			}
			for (int j = i; j < n; j++) {
				if (arr[j] % 2 == 1) {
					arr[j]--;
					result++;
				}
			}
		}

	}
}
