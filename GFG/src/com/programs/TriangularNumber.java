package com.programs;

/*https://practice.geeksforgeeks.org/problems/triangular-number/0/?ref=self*/
import java.util.Scanner;

public class TriangularNumber {

	public static void main(String[] args) {
		int[] a = new int[1000000];
		int sum = 0;
		a[0] = 1;
		// long time = System.currentTimeMillis();
		for (long i = 1; i < 1000000; i++) {
			sum += i;
			a[(int) i] = sum;
		}
		// System.out.println(Arrays.toString(a));
		// System.out.println(System.currentTimeMillis() - time);
		/*
		 * for (int i:a) { System.out.println(i); }
		 */

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean hai = false;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == n) {
					hai = true;
					break;
				}
			}
			if (hai)
				System.out.println(1);
			else
				System.out.println(0);

		}

	}

}
