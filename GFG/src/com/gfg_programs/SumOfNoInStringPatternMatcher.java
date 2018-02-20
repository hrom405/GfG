package com.gfg_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNoInStringPatternMatcher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			Pattern pattern = Pattern.compile("[0-9]+");
			String s = sc.next();
			Matcher matcher = pattern.matcher(s);
			long sum = 0;

			while (matcher.find()) {

				//System.err.println("str : " + matcher.group());

				sum += Long.valueOf(matcher.group());
			}
			System.out.println(sum);
		}
	}
}
