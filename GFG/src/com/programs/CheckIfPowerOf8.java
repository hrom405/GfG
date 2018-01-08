package com.programs;

/*https://practice.geeksforgeeks.org/problems/check-if-a-integer-is-power-of-8-or-not/0/?ref=self*/
import java.util.Scanner;

public class CheckIfPowerOf8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			int a = (int) (Math.log(n) / Math.log(8));
			if (Math.pow(8, a) == n)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
