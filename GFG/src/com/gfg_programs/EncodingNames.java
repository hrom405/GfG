package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/encoding-names/0*/
import java.util.Scanner;

public class EncodingNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int len = s.length();
			String str = "";
			for (int i = 0; i < len; i++) {
				str += (((int) s.charAt(i) - 10) + i);
			}
			System.out.println(str);
		}
	}
}
