package com.gfg_programs;

import java.util.Scanner;

public class SMSAnalyser {
	static String[] str = { "love", "babe", "sweety", "life" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split("\\s");
		// System.out.println(Arrays.toString(words));
		int a = 0;
		int len = words.length;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (words[i].equals(str[j])) {
					a++;
				}
			}
		}
		int div = 2;
		while (div <= words.length) {
			if (a % div == 0 && len % div == 0) {
				a /= div;
				len /= div;
			} else
				div++;
		}
		System.out.println(a + "/" + len);
	}
}