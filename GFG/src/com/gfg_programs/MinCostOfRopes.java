package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes/0/?ref=self*/
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinCostOfRopes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(check(a, n));
		}
	}

	private static int check(int[] a, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < n; i++)
			pq.add(a[i]);

		int res = 0;
		while (pq.size() > 1) {
			// System.out.println(pq.toString());
			int first = pq.poll();
			int second = pq.poll();
			res += first + second;
			pq.add(first + second);
		}
		return res;
	}
}
