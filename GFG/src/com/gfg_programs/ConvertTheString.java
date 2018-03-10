package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/convert-the-string/0*/
import java.util.Scanner;

public class ConvertTheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String input = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			if (null == input) {
				System.out.println("-1");
			} else {
				input = input.replaceAll("[aeiouAEIOU]", "");
				input = input.replaceAll("[a-zA-Z]", "#$0");
				for (int i = 0; i < input.length(); i++) {
					if (Character.isLowerCase(input.charAt(i))) {
						sb.append((input.charAt(i) + "").toUpperCase());
					} else if (Character.isUpperCase(input.charAt(i))) {
						sb.append((input.charAt(i) + "").toLowerCase());
					} else {
						sb.append(input.charAt(i) + "");
					}
				}
				System.out.println(sb.toString());
			}
		}
	}
}
