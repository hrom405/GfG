package com.programs;

/*https://practice.geeksforgeeks.org/problems/majority-element/0/?ref=self*/
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int cnt = 0;
			int flag = 0;
			for (int i = 0; i < a.length; i++) {
				cnt = 0;
				int ele = a[i];
				for (int j = 0; j < a.length; j++) {
					if (a[j] == ele) {
						cnt++;
					}
				}
				if (cnt > (n / 2)) {
					flag = 1;
					System.out.println(a[i]);
					break;
				}
			}
			if (flag == 0)
				System.out.println("NO Majority Element");
		}
	}
}
