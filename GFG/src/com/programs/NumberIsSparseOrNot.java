package com.programs;

/*https://practice.geeksforgeeks.org/problems/number-is-sparse-or-not/0/?ref=self*/
import java.util.Scanner;

public class NumberIsSparseOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(checkSparse(n));
		}
	}

	public static int checkSparse(int n) {
		String str = Integer.toBinaryString(n);
		int flag = 0;
		for (int i = str.length() - 1; i > 0; i--) {
			if (flag == 1)
				break;
			if (str.charAt(i) == '1' && str.charAt(i - 1) == '1')
				flag = 1;
		}
		if (flag == 0)
			return 1;
		else
			return 0;
	}
}
