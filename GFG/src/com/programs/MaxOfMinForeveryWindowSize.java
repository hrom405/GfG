package com.programs;

/*https://practice.geeksforgeeks.org/problems/maximum-of-minimum-for-every-window-size/0/?ref=self*/
import java.util.Arrays;
import java.util.Scanner;

public class MaxOfMinForeveryWindowSize {
	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int[] ans = new int[n];
			int k = 1;
			for (int i = 0; i < n; i++) {
				ans[i] = check(k);
				k++;
			}
			// System.err.println(Arrays.toString(ans));
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] + " ");
			}
			System.out.println();
		}

	}

	private static int check(int k) {
		int[] checkArray = new int[a.length];
		int min = 0;
		for (int i = 0; i <= a.length - k; i++) {
			min = a[i];
			for (int j = 1; j < k; j++) {
				if (a[i + j] < min) {
					min = a[i + j];
				}
			}
			checkArray[i] = min;
		}
		// System.out.println("Check Array-->"+Arrays.toString(checkArray));
		Arrays.sort(checkArray);

		return checkArray[a.length - 1];
	}

}
