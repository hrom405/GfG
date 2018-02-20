package com.gfg_programs;

import java.util.Scanner;

public class BinaryString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			String s = sc.next();
			int cnt = 0;

			for (int i = 0; i < n; i++)
				for (int j = i + 1; j < n; j++)
					if (s.charAt(i) == '1')
						if (s.charAt(j) == '1')
							cnt++;
			System.out.println(cnt);
		}
	}
}
