package com.gfg_programs;

/*https://www.codechef.com/problems/LUCKFOUR*/
import java.math.BigInteger;
import java.util.Scanner;

public class LuckyFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger n = sc.nextBigInteger();
			String s = String.valueOf(n);
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '4') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
