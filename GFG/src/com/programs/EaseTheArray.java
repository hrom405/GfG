package com.programs;

/*not accepting the code
 * Try it with stack*/
import java.util.Scanner;

public class EaseTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] ab = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				ab[i] = 0;
			}
			for (int i = 0; i < n - 1; i++) {
				if (a[i] != 0 && a[i] == a[i + 1]) {
					a[i] *= 2;
					a[i + 1] = 0;
				}
			}
			int k = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] != 0) {
					ab[k] = a[i];
					k++;
				}
			}
			for (int i = 0; i < ab.length; i++) {
				System.out.print(ab[i] + " ");
			}
			System.out.println();
		}
	}
}
