package com.gfg_programs;

/*https://www.codechef.com/COOK90/problems/SURVIVE*/
import java.util.Scanner;

public class SurviveInChocoland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int S = sc.nextInt();
			if (K > N) {
				System.out.println(-1);
				break;
			}
			if (K * 7 <= N * 6) {
				System.out.println((K * S + (N - 1)) / N);
			} else if (S < 7)
				System.out.println((K * S + (N - 1)) / N);
			else
				System.out.println(-1);
		}
	}
}