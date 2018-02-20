package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/factorial-number/0/?ref=self*/
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long i, j, fact = 1, flag = 0, lim;
			lim = sc.nextInt();
			for (i = 1; fact <= lim; i++) {
				fact = fact * i;
				if (fact == lim) {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
