package com.gfg_programs;

/*https://www.codechef.com/GSMAR18/problems/GSMAR18C*/
import java.util.Scanner;

public class PostTML2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int p = sc.nextInt();
			String str = sc.next();
			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'P')
					cnt++;
			}
			if (cnt + k < p)
				System.out.println("no");
			else
				System.out.println("yes");
		}
	}
}