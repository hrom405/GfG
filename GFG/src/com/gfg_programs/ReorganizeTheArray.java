package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/reorganize-the-array/0*/
import java.util.Scanner;

public class ReorganizeTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = -1;
			}
			for (int i = 0; i < a.length; i++) {
				int nm = sc.nextInt();
				if (nm >= 0) {
					a[nm] = nm;
				}
			}
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}

}
