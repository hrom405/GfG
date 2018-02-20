package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-two-arrays/0/?ref=self*/
import java.util.Scanner;

public class Add2NosRepresentedByArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			int[] b = new int[m];
			for (int i = 0; i < b.length; i++) {
				b[i] = sc.nextInt();
			}
			StringBuilder ab = new StringBuilder();
			StringBuilder bb = new StringBuilder();
			for (int i = 0; i < a.length; i++) {
				ab.append(a[i] + "");
			}
			for (int i = 0; i < b.length; i++) {
				bb.append(b[i] + "");
			}
			System.out.println(Integer.valueOf(ab.toString()) + Integer.valueOf(bb.toString()));
		}

	}

}
