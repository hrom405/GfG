package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/equilibrium-point/0/?ref=self*/
import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			if (n == 1) {
				System.out.println(1);
			} else {
				int left_sum = 0;
				int right_sum = 0;
				int k = 0;
				boolean f = false;
				while (k != n - 1) {
					left_sum = 0;
					right_sum = 0;
					for (int i = 0; i < k; i++) {
						left_sum += a[i];
					}
					// System.out.println("Left sum-->" + left_sum);
					for (int j = k + 1; j < n; j++) {
						right_sum += a[j];
					}
					// System.out.println("Right sum-->" + right_sum);
					if (right_sum == left_sum) {
						System.out.println(++k);
						f = true;
						break;
					} else {
						k++;
						f = false;
					}
				}
				if (f == false)
					System.out.println(-1);
			}
		}
	}

}
