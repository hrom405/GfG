package com.gfg_programs;

import java.util.Scanner;

public class NumberToWords {
	static String units[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen" };
	static String tens[] = { "zero", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninty", "hundred", "", "", "", "", "", "", "", "", "", "", "" };
	// static int unit[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
	// 16, 17, 18, 19 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(str(n));
		}
	}

	public static String str(int num) {
		String word = "";
		if (num == 0)
			return "zero";

		if ((num / 1000000000) > 0) {
			word += str(num / 1000000000) + " billion ";
			num %= 1000000000;
		}
		if ((num / 10000000) > 0) {
			word += str(num / 10000000) + " crore ";
			num %= 10000000;
		}

		if ((num / 100000) > 0) {
			word += str(num / 100000) + " lacks ";
			num %= 100000;
		}

		if ((num / 1000) > 0) {
			word += str(num / 1000) + " thousand ";
			num %= 1000;
		}
		if ((num / 100) > 0) {
			word += str(num / 100) + " hundred and ";
			num %= 100;
		}

		if (num < 20)
			word += units[num];
		else {
			word += tens[num / 10] + units[num % 10];
		}

		return word;
	}
}
