package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string/0/?ref=self*/
import java.util.Scanner;

public class MaxDifferenceOf0sAnd1sInBinaryString {
	static int max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			// System.out.println(check(str));
			max = 0;
			int dif = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '0') {
					for (int j = str.length() - 1; j > i; j--) {
						if (str.charAt(j) == '0') {
							dif = check(str, i, j);
							if (max < dif) {
								max = dif;
							}
						}
					}
				}
			}
			if (max == 0)
				System.out.println(-1);
			else
				System.err.println(max);
		}
	}

	private static int check(String str, int i, int j) {
		int zeros = 0;
		int ones = 0;
		int dif = 0;
		for (int j2 = i; j2 <= j; j2++) {
			// System.out.print(str.charAt(j2));
			if (str.charAt(j2) == '1') {
				ones++;
			} else
				zeros++;
		}
		// System.out.println("\n--------------------------------");
		dif = zeros - ones;
		return dif;
	}

}
