package com.programs;

/*https://practice.geeksforgeeks.org/problems/numbers-with-one-absolute-difference/0/?ref=self*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberWithOneAbsoluteDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			if (n <= 9)
				System.out.println(-1);
			else {
				Queue<Long> q = new LinkedList<>();

				for (long i = 1; i <= 9; i++) {
					q.add(i);
				}
				long temp = q.peek();
				while (temp < n) {
					temp = q.poll();
					if (temp >= 10 && temp <= n) {
						System.out.print(temp + " ");
					}
					long last = temp % 10;
					long number = temp;
					long add;
					if (last == 0) {
						add = number * 10 + 1;
						q.add(add);

					} else if (last == 9) {
						add = number * 10 + 8;
						q.add(add);
					} else {
						add = number * 10 + last - 1;
						q.add(add);
						add = number * 10 + last + 1;
						q.add(add);
					}
				}
				System.out.println();
			}
		}
	}
}
