package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/first-come-first-serve/0*/
import java.util.Scanner;

public class FirstComeFirstServe {

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
			int flag = 0;
			for (int i = 0; i < a.length; i++) {
				cnt = 0;
				for (int j = 0; j < a.length; j++) {
					if (a[j] == a[i])
						cnt++;
				}
				if (cnt == k) {
					System.out.println(a[i]);
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println(-1);
		}
	}

}
