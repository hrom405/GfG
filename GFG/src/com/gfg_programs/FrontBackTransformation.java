package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/front-back-transformation/0/?ref=self*/
import java.util.Scanner;

public class FrontBackTransformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String res = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
					res += (char) ('z' - (s.charAt(i) - 'a'));
				if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
					res += (char) ('Z' - (s.charAt(i) - 'A'));
			}
			System.out.println(res);
		}
	}
}
