package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/last-index-of-a-character-in-the-string/0/?ref=self*/
import java.util.Scanner;

public class LastIndexOfCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s = sc.nextLine();
			char x = sc.nextLine().charAt(0);
			int flag = 0;
			for (int i = s.length() - 1; i >= 0; i--) {
				if (s.charAt(i) == x) {
					System.out.println(i);
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println(-1);
		}
	}
}
