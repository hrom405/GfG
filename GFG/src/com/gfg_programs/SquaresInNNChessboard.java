package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/squares-in-nn-chessboard/0*/
import java.util.Scanner;

public class SquaresInNNChessboard {
	static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int num = sc.nextInt();
			sum = 0;
			for (int i = 1; i <= num; i++) {

				int fsum = 0;
				fsum = check(i);
				sum += fsum;

			}
			System.out.println(sum);
		}
	}

	static int check(int num) {
		int div = 0;
		for (int i = 1; i <= num; i++) {
			div = i * i;
		}
		return div;
	}
}
