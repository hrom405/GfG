package com.programs;

/*https://practice.geeksforgeeks.org/problems/even-odd-turn-game/0/?ref=self*/
import java.util.Scanner;

public class EvenOddTurnGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int p = sc.nextInt();
			if (p % 2 == 0)
				System.out.println((Math.max(x, y) / Math.min(x, y)));
			else
				System.out.println(Math.max(2 * x, y) / Math.min(2 * x, y));
		}
	}
}
