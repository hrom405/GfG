package com.programs;

/*https://practice.geeksforgeeks.org/problems/mr-modulo-and-pairs/0/?ref=self*/
import java.util.Scanner;

public class MrModuloAndPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] % a[j] == k || a[j] % a[i] == k) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
