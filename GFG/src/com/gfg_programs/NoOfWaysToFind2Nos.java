package com.gfg_programs;

import java.util.Scanner;

public class NoOfWaysToFind2Nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int k = sc.nextInt();
			int cnt = 0;
			for (int i = 1; i < k; i++)
				for (int j = i + 1; j < k; j++)
					if (i + j <= k)
						cnt++;

			System.out.println(cnt);
		}
		sc.close();
	}

}
