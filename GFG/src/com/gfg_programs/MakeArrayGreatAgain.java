package com.gfg_programs;

/*https://www.codechef.com/COOK90/problems/MAGA*/
import java.util.Scanner;

public class MakeArrayGreatAgain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++)
				a[i] = sc.nextInt();

			if (n == 3)
				System.out.println(1);
			else if (n % 3 == 0 || n % 3 == 1)
				System.out.println((n / 3) - 1);
			else if (n % 3 == 2)
				System.out.println(n / 3);
		}
	}
}