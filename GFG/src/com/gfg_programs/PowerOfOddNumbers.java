package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/power-of-pow-odd-numbers/0/?ref=self*/
import java.util.Scanner;

public class PowerOfOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long sum = 0;

			for (int i = 1; i <= n; i++) {
				int z = (i - 1) * 2 + 1;
				sum += Math.pow(z, 2.0);
			}

			System.out.println(sum);

		}
	}
}
