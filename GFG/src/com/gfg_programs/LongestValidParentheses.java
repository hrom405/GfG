package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/longest-valid-parentheses/0*/
import java.util.Scanner;
import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		while (T-- > 0) {
			String S = in.nextLine();
			int res = 0;
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(-1);
			for (int i = 0; i < S.length(); ++i) {
				if (S.charAt(i) == '(') {
					stack.push(i);
				} else if (S.charAt(i) == ')') {
					stack.pop();
					if (!stack.isEmpty())
						res = Integer.max(res, i - stack.peek());
					else
						stack.push(i);
				}
			}
			System.out.println(res);
		}
	}
}
