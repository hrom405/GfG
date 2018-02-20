package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/sum-of-fai-aj-over-all-pairs-in-an-array-of-n-integers/0*/
import java.util.Scanner;

public class SumOfAllPairsOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int fof = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if ((Math.abs(a[j] - a[i])) > 1)
						fof += a[j] - a[i];
					else if (a[j] - a[i] <= 1)
						fof += 0;
				}
			}
			System.out.println(fof);
		}
	}

}
