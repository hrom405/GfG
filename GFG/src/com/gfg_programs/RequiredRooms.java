package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/required-rooms/0*/
import java.util.Scanner;

public class RequiredRooms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int gcd = gcd(A, B);
			int sum = 0;
			sum = (A / gcd) + (B / gcd);
			System.out.println(sum);
		}
	}

	static int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return 0;

		if (a == b)
			return a;

		if (a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}
}
