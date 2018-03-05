package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/keypad-typing/0*/
import java.util.Scanner;

public class KeywordTyping {
	public static void res(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 115)
				System.out.print(2 + (s.charAt(i) - 97) / 3);
			else if (s.charAt(i) == 115)
				System.out.print(7);
			else if (s.charAt(i) < 119)
				System.out.print(8);
			else
				System.out.print(9);
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
			res(sc.next());
	}
}
