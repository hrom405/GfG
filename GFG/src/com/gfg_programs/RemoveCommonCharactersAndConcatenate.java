package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/remove-common-characters-and-concatenate/0/?ref=self*/
import java.util.Scanner;

public class RemoveCommonCharactersAndConcatenate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s1 = sc.next();
			String s2 = sc.next();
			String s = "";
			s += unique(s1, s2);
			s += unique(s2, s1);
			if (s.equals(""))
				System.out.println(-1);
			else
				System.out.println(s);
		}
	}

	public static String unique(String s1, String s2) {
		String s = "";
		int flag = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			flag = 0;
			for (int j = 0; j < s2.length(); j++) {
				if (s2.charAt(j) == c)
					flag = 1;
				if (flag == 1)
					break;
			}
			if (flag == 0)
				s += c;
		}
		return s;
	}
}
