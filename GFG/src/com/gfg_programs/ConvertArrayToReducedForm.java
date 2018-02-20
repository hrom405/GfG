package com.gfg_programs;

/*Given an array with n distinct elements, convert the given array to a reduced form where all elements are in range from 0 to n-1.
 *  The order of elements is same, i.e., 0 is placed in place of smallest element,
 *   1 is placed for second smallest element, � n-1 is placed for largest element.*/
import java.util.Arrays;
import java.util.Scanner;

public class ConvertArrayToReducedForm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			// System.out.println(Arrays.toString(a));
			int[] ab = new int[n];

			for (int i = 0; i < n; i++)
				ab[i] = a[i];

			Arrays.sort(ab);
			// System.out.println(Arrays.toString(ab));

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i] == ab[j]) {
						a[i] = j;
						break;
					}
				}
			}
			// System.out.println(Arrays.toString(a));
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();

		}
	}
}
