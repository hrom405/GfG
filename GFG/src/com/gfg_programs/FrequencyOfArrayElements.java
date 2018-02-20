package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/frequency-of-array-elements/0*/
import java.util.Scanner;

public class FrequencyOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < a.length; i++)
				a[i] = sc.nextInt();
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {
				cnt = 0;
				for (int j = 0; j < a.length; j++) {
					if (a[j] == i + 1)
						cnt++;
				}
				b[i] = cnt;
			}
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}
	}
}
