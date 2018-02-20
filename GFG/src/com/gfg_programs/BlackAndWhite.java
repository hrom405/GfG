package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/black-and-white/0*/
import java.util.Scanner;

public class BlackAndWhite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int cnt = 0;
			int total = 0;
			int[][] arr = new int[N][M];
			// total=(N*M)-(N*M-1);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					cnt += (N * M) - isSafe(arr, i, j, N, M) - 1;
				}
			}
			System.out.println(cnt);
		}
	}

	static int isSafe(int[][] arr, int i, int j, int N, int M) {

		int sum = 0;

		if (i + 2 < N && j + 1 < M)
			sum++;
		if (i + 2 < N && j - 1 >= 0)
			sum++;
		if (i - 2 >= 0 && j + 1 < M)
			sum++;
		if (i - 2 >= 0 && j - 1 >= 0)
			sum++;
		if (i + 1 < N && j + 2 < M)
			sum++;
		if (i - 1 >= 0 && j + 2 < M)
			sum++;
		if (i + 1 < N && j - 2 >= 0)
			sum++;
		if (i - 1 >= 0 && j - 2 >= 0)
			sum++;
		return sum;
	}

}
