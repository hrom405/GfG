package com.gfg_programs;

import java.util.Scanner;

public class SMSAnalyzer {
	static String[] str = { "love", "babe", "sweety", "life" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split("\\s");
		int a = 0;
		int len = words.length;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(str[j])) {
					a++;
				}
			}
		}
		int i = 2;
		while (i <= words.length) {
			if (a % i == 0 && len % i == 0) {
				a /= i;
				len /= i;
			} else
				i++;
		}
		System.out.println(a + "/" + len);
	}

}
