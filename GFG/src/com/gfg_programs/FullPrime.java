package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/full-prime/0/?ref=self*/
import java.util.Scanner;

public class FullPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean flag = false;
			if (isPrime(n)) {
				String s = String.valueOf(n);
				for (int i = 0; i < s.length(); i++) {
					flag = isPrime(s.charAt(i) - '0');
					if (flag == false)
						break;
				}
			}
			if (flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	public static boolean isPrime(int i) {
		int factors = 0;
		int j = 1;

		while (j <= i) {
			if (i % j == 0) {
				factors++;
			}
			j++;
		}
		return (factors == 2);
	}
}
