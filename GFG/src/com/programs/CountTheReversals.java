package com.programs;

import java.util.Scanner;

public class CountTheReversals {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			int n = str.length();
			if ((n & 1) == 1) {
				System.out.println(-1);
				continue;
			}
			int flip = 0;
			int stk = 0;
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == '{')
					++stk;
				else {
					if (stk > 0)
						--stk;
					else {
						++flip;
						++stk;
					}
				}
			}
			if (stk > 0) {
				flip += stk / 2;
			}
			System.out.println(flip);
		}
	}
}
