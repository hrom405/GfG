package com.gfg_programs;
/*https://www.codechef.com/FEB18/problems/CHANOQ*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChefAndOddQueries {

	public static void main(String[] args) throws IOException {
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n * 2];
			for (int i = 0; i < n; i++) {
				// a[i] = Integer.parseInt(br.readLine());
				String num[] = br.readLine().split(" ");
				a[i * 2] = Integer.parseInt(num[0]);
				a[(i * 2) + 1] = Integer.parseInt(num[1]);
			}
			int q = Integer.parseInt(br.readLine());
			for (int j = 0; j < q; j++) {
				int m = Integer.parseInt(br.readLine());
				int x[] = new int[m];
				for (int k = 0; k < m; k++) {
					x[k] = Integer.parseInt(br.readLine());
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
