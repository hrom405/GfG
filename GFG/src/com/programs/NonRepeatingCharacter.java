package com.programs;

import java.util.Scanner;

public class NonRepeatingCharacter {
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int s = sc.nextInt();
			String str = sc.next();
			char[] cs = new char[str.length()];
			cs = str.toCharArray();
			int[] a = new int[s];
			for (int i = 0; i < a.length; i++) {
				cnt = 0;
				for (int j = 0; j < a.length; j++) {
					if (str.charAt(i) == str.charAt(j)) {
						cnt++;
					}
				}
				a[i] = cnt;
			}
			// System.out.println(Arrays.toString(cs));
			// System.out.println(Arrays.toString(a));
			for (int i = 0; i <= a.length; i++) {
				if (i == a.length) {
					System.out.println(-1);
					break;
				}
				if (a[i] == 1) {
					System.out.println(cs[i]);
					break;
				}
			}
		}
	}

}
