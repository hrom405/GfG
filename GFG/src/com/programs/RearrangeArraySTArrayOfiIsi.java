package com.programs;

/*https://practice.geeksforgeeks.org/problems/rearrange-an-array-such-that-arri-i/0*/
import java.util.Scanner;

public class RearrangeArraySTArrayOfiIsi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			a = check(a);
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}

	public static int[] check(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1 && a[i] != i) {
				int x = a[i];
				while (a[x] != -1 && a[x] != x) {
					int y = a[x];
					a[x] = x;
					x = y;
				}
				a[x] = x;
				if (a[i] != i) {
					a[i] = -1;
				}
			}
		}
		return a;
	}
}
