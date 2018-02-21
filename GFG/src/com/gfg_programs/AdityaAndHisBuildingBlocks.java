package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/aditya-and-his-building-blocks/0*/
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class AdityaAndHisBuildingBlocks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int m = sc.nextInt();
			Queue<Integer> pq = new PriorityQueue<Integer>();
			for (int i = 0; i < n; i++)
				pq.add(sc.nextInt());
			// System.out.println(pq.toString());
			for (int i = 0; i < m; i++) {
				int a = pq.poll();
				pq.add(++a);
				// System.out.println(pq.toString());
			}
			System.out.println(pq.peek());
		}
	}
}