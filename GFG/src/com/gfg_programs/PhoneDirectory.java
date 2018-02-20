package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/phone-directory/0/?ref=self*/
/*Submitted another code on GFG*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneDirectory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String[] s = new String[n];
			for (int i = 0; i < s.length; i++) {
				s[i] = sc.next();
			}
			Arrays.sort(s);
			String fs = sc.next();
			ArrayList<String> al;
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < fs.length(); i++) {
				al = new ArrayList<>();
				builder.append(fs.charAt(i));
				for (int j = 0; j < s.length; j++) {
					String check = builder.toString();
					boolean hai = true;

					for (int k = 0; k < check.length(); k++) {
						if (check.charAt(k) != s[j].charAt(k)) {
							hai = false;
						}
						if (hai == false) {
							break;
						}
					}
					if (hai == true) {
						al.add(s[j]);
					}
				}
				if (al.size() == 0) {
					System.out.println(0);
				} else {
					for (String abc : al) {
						System.out.print(abc + " ");
					}
					System.out.println();
				}
				// System.out.println();
			}
		}
	}
}
