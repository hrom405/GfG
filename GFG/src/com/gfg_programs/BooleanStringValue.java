package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/boolean-string-value/0/?ref=self*/
import java.util.Scanner;

public class BooleanStringValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int ans = Integer.valueOf(s.charAt(0) + "");
			for (int i = 1; i < s.length(); i++) {
				char a = s.charAt(i);
				i++;
				int b = Integer.valueOf(s.charAt(i) + "");
				switch (a) {
				case 'A':
					ans = ans & b;
					break;
				case 'B':
					ans = ans | b;
					break;
				case 'C':
					ans = ans ^ b;
					break;
				}
			}
			System.out.println(ans);
		}
	}
}
