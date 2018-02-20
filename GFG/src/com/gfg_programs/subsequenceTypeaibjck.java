package com.gfg_programs;

import java.util.Scanner;

public class subsequenceTypeaibjck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			String str = sc.next();
			int len = str.length();
			int a = 0, b = 0, c = 0;
			for (int i = 0; i < len; i++) {
				char ch = str.charAt(i);
				if (ch == 'a')
					a = 1 + 2 * a;
				else if (ch == 'b')
					b = a + 2 * b;
				else if (ch == 'c')
					c = b + 2 * c;
			}
			System.out.println(c);
		}
	}

}
