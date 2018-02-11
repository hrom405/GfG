package com.programs;

/*https://www.codechef.com/FEB18/problems/CHANOQ*/
import java.util.Arrays;
import java.util.Scanner;

public class ChefAndOddQueries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n * 2];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			for (int j = 0; j < q; j++) {
				int m = sc.nextInt();
				int x[] = new int[m];
				for (int k = 0; k < m; k++) {
					x[k] = sc.nextInt();
				}
				Arrays.sort(x);
				int cnt = 0;
				for (int i = 0; i < n; i++) {
					if (check(x, a[i * 2], a[(i * 2) + 1]) % 2 == 1)
						cnt++;
				}
				System.out.println(cnt);
			}
		}
	}

	private static int check(int[] x, int l, int r) {
		int cnt = 0;
		// System.out.println("l-->" + l + "\tr-->" + r);
		for (int i = l; i <= r; i++)
			for (int j = 0; j < x.length; j++) {
				// System.out.println("i" + i);
				if (i == x[j]) {
					cnt++;
					break;
				}
			}
		return cnt;
	}
}
