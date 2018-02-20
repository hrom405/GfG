package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not/0/?ref=self*/
import java.util.HashMap;
import java.util.Scanner;

public class IsogramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			HashMap<Character, Integer> h = new HashMap<>();
			for (int i = 0; i < s.length(); i++) {
				h.put(s.charAt(i), 1);
			}
			if (h.size() == s.length())
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
