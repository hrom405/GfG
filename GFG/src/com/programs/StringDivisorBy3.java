package com.programs;

import java.util.Scanner;

public class StringDivisorBy3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int even_sum = 0, odd_sum = 0;
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0 && s.charAt(i) == '1')
					even_sum++;
				if (i % 2 == 1 && s.charAt(i) == '1')
					odd_sum++;
			}
			if (Math.abs(even_sum - odd_sum) % 3 == 0)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
