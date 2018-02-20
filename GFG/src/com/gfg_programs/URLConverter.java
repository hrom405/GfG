package com.gfg_programs;

/*Design a system that takes big URLs like “http://www.geeksforgeeks.org/count-sum-of-digits-in-numbers-from-1-to-n/” 
 * and converts them into a short 6 character URL. 
 * It is given that URLs are stored in database and every URL has an associated integer id.  
 * So your program should take an integer id and generate a 6 character long URL. 

 * A URL character can be one of the following
 * 1) A lower case alphabet [‘a’ to ‘z’], total 26 characters
 * 2) An upper case alphabet [‘A’ to ‘Z’], total 26 characters
 * 3) A digit [‘0′ to ‘9’], total 10 characters

 * There are total 26 + 26 + 10 = 62 possible characters.

 * So the task is to convert an integer (database id) to a base 62 number where digits of 62 base are 
 * "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"*/
import java.util.Scanner;
import java.util.Stack;

public class URLConverter {
	static String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		// Stack<Integer> s = new Stack<>();
		while (t-- > 0) {
			long n = sc.nextLong();
			long h = n;
			String str = convertIntoString(n);
			System.out.println(str);
			System.out.println(h);
		}
	}

	private static String convertIntoString(long n) {
		StringBuilder builder = new StringBuilder();
		Stack<Integer> s = new Stack<>();
		int rem;
		int top = -1;
		while (n > 0) {
			rem = 0;
			rem = (int) n % 62;
			s.push(rem);
			top++;
			n /= 62;
		}
		for (int i = top; i >= 0; i--) {
			builder.append(base.charAt(s.pop()));
		}
		return builder.toString();
	}

}
