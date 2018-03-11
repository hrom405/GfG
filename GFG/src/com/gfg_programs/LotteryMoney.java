package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/lottery-money/0*/
import java.util.Scanner;

public class LotteryMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(calculateMoney(n));
		}
	}

	public static int calculateMoney(int n) {
		int i = 4;
		while (i <= n) {
			i = 2 * i + 2;
		}
		return i - n;
	}
}
