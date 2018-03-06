package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/alone-in-couple/0/?ref=self*/
import java.util.Scanner;
//sorry

public class AloneInCouple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {
				int num = a[i];
				cnt = 0;
				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j])
						cnt++;
				}
				if (cnt == 1) {
					System.out.println(a[i]);
					break;
				} else
					System.out.println();
			}
		}
	}

}
