package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/three-consecutive-duplicates/0/?ref=self*/
import java.util.ArrayList;
import java.util.Scanner;

public class ThreeConsecutiveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			System.out.println(check(s));
		}
	}

	private static String check(String s) {
		int flag = 0;
		ArrayList<Character> al = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			al.add(s.charAt(i));
		}
		while (flag != 1) {
			flag = 1;
			for (int i = 0; i < al.size() - 2; i++) {
				if (al.get(i) == al.get(i + 1) && al.get(i + 1) == al.get(i + 2)) {
					al.remove(i);
					al.remove(i);
					al.remove(i);
					flag = 0;
				}
			}
		}
		String str = "";
		for (int i = 0; i < al.size(); i++) {
			str = str + al.get(i);
		}
		if (str.equals(""))
			return "-1";
		else
			return str;
	}
}
