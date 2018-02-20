package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/largest-number-in-k-swaps/0*/
import java.util.Scanner;

public class LargestNumberInKSwaps {
	static String max;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		int T = sc.nextInt();
		while (T-- > 0) {
			int K = sc.nextInt();
			String num = sc.next();
			max = num;
			maxNum(num.toCharArray(), K);
			output.append(max).append("\n");
		}
		System.out.println(output);
	}

	static void maxNum(char num[], int k) {
		if (k == 0)
			return;
		char c;
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] > num[i]) {
					c = num[j];
					num[j] = num[i];
					num[i] = c;
					String curr = String.valueOf(num);
					if (curr.compareTo(max) > 0)
						max = curr;
					maxNum(num, k - 1);
					c = num[j];
					num[j] = num[i];
					num[i] = c;
				}
			}
		}
	}
}
