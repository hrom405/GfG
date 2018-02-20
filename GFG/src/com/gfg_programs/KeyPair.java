package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/key-pair/0/?ref=self*/
import java.util.Scanner;

public class KeyPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			boolean h = false;
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] == x - a[i])
						h = true;
					if (h)
						break;
				}
				if (h)
					break;
			}
			if (h)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
