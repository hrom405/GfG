package com.programs;

/*https://practice.geeksforgeeks.org/problems/product-sum/0/?ref=self*/
import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			BigInteger c = new BigInteger(a + "").multiply(new BigInteger(b + ""));
			String s = String.valueOf(c);
			System.out.println("String-->" + s);
			Pattern pattern = Pattern.compile("[0-9]+");
			Matcher matcher;
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				matcher = pattern.matcher(s.charAt(i) + "");
				if (matcher.matches()) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
