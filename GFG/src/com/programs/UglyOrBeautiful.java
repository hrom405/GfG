package com.programs;

/*https://www.hackerrank.com/contests/codeagon/challenges/ugly-or-beautiful/problem*/
import java.util.Arrays;
import java.util.Scanner;

public class UglyOrBeautiful {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int flag = 0;
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				b[i] = a[i];
				if (a[i] > n)
					flag = 1;
			}
			Arrays.sort(b);
			if (flag == 1 || Arrays.equals(a, b))
				System.out.println("Ugly");
			else
				System.out.println("Beautiful");
		}
	}
}
