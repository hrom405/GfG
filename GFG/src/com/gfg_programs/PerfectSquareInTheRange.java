package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/perfect-squares-in-a-range/0*/
import java.util.Scanner;

public class PerfectSquareInTheRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cnt = 0;
			for (int i = (int) Math.sqrt(a); i <= Math.sqrt(b); i++) {
				int val = (int) Math.pow(i, 2);
				if (val >= a && val <= b)
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}
