package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/aryas-long-string/0*/
import java.util.Scanner;

public class AryasLongString {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int n = sc.nextInt();
			int x = sc.nextInt();
			char s1 = sc.next().charAt(0);
			int cnt = 0;
			int i = 0;
			while (x-- > 0) {
				if (i == s.length()) {
					i = 0;
				}
				if (s1 == s.charAt(i)) {
					cnt++;
				}
				i++;
			}
			System.out.println(cnt);
		}
	}
}
