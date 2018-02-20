package com.gfg_programs;
/*https://practice.geeksforgeeks.org/problems/string-manipulation/0/?ref=self*/
import java.util.Arrays;
import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String[] a = new String[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.next();
			}
			System.err.println(Arrays.toString(a));
			int cnt = 0;
			boolean b = false;
			for (int i = 0; i < n; i++) {
				if (i == (n - 1 - i)) {
					cnt += 1;
					b = true;
				}
				if (i > (n - 1 - i))
					b = true;
				if (b)
					break;

				if (!a[i].equals(a[n - 1 - i]) && i < (n - 1 - i)) {
					cnt += 2;
				}

			}
			System.out.println(cnt);
		}
	}

}
