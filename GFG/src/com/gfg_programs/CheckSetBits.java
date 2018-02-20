package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/check-set-bits/0/?ref=self*/
import java.util.Scanner;

public class CheckSetBits {

	public static void main(String[] args) {
		int[] a = new int[1000];
		int num = 1;
		a[0] = num;
		for (int j = 1; j < a.length; j++) {
			a[j] = (a[j - 1] * 2) + 1;
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean h = false;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == n) {
					h = true;
					break;
				}
			}
			if (h == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
