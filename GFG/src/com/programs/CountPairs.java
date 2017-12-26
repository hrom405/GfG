package com.programs;

/*https://practice.geeksforgeeks.org/problems/count-pairs/0/?ref=self*/
import java.util.Scanner;

public class CountPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int count = 0;

			for (int i = -100; i <= 100; i++) {
				int j = A - i;
				if (i * i * i + j * j * j == B)
					count++;
			}
			System.out.println(count);
		}
	}
}
