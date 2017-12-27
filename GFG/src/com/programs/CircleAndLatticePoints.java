package com.programs;

/*https://practice.geeksforgeeks.org/problems/circle-and-lattice-points/0/?ref=self*/
import java.util.Scanner;

public class CircleAndLatticePoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
	}

	static int check(int r) {
		int cnt = 0;
		for (int i = 0; i <= r; i++) {
			if (Math.floor(Math.sqrt(Math.pow(r, 2) - Math.pow(i, 2))) == Math.sqrt(Math.pow(r, 2) - Math.pow(i, 2)))
				cnt++;
		}
		return 4 * (cnt - 1);
	}
}
