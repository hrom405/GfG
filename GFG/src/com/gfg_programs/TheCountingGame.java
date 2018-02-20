package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/the-counting-game/0/?ref=self*/
import java.util.Scanner;

public class TheCountingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int len = s.length();
			int cnt = 0;
			for (int i = 0; i < len; i++) {
				if (s.charAt(i) <= 90 && s.charAt(i) >= 65)
					cnt++;
			}
			System.out.println(++cnt);
		}
	}
}
