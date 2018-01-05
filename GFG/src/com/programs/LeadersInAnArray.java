package com.programs;

/*https://practice.geeksforgeeks.org/problems/leaders-in-an-array/0/?ref=self*/
import java.util.Scanner;

public class LeadersInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			boolean h = false;
			for (int i = 0; i < a.length; i++) {
				h = true;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j] && h == true) {
						h = true;
					} else
						h = false;
				}
				if (h == true) {
					System.out.print(a[i] + " ");
				}
			}
			System.out.println();
		}
	}
}
