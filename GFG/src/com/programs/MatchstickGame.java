package com.programs;

/*https://practice.geeksforgeeks.org/problems/-matchsticks-game/0*/
import java.util.Scanner;

public class MatchstickGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			if (n % 5 == 0)
				System.out.println(-1);
			else
				System.out.println(n % 5);
		}
	}
}
