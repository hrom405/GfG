package com.programs;

/*https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array/0/?ref=self*/
import java.util.Scanner;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int flag = 0;
			int k = sc.nextInt();
			for (int i = 0; i < a.length; i++) {
				if (a[i] == k) {
					System.out.println(i);
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println(-1);
		}
	}

}
