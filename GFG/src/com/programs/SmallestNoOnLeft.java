package com.programs;

/*Given an array of integers, find the nearest smaller number for every element such that the smaller element is on left side.
 * If no small element present on the left print -1.*/
import java.util.Scanner;

public class SmallestNoOnLeft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int[] ab = new int[n];

			for (int i = 0; i < n; i++) {
				for (int j = i; j >= 0; j--) {
					if (i == 0) {
						ab[i] = -1;
					} else {
						if (a[j] < a[i]) {
							ab[i] = a[j];
							break;
						} else
							ab[i] = -1;
					}
				}
			}
			// System.out.println(Arrays.toString(ab));
			for (int i = 0; i < n; i++) {
				System.out.print(ab[i] + " ");
			}
			System.out.println();
		}
	}

}
