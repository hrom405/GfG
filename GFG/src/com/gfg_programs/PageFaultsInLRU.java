package com.gfg_programs;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*https://practice.geeksforgeeks.org/problems/page-faults-in-lru/0*/
public class PageFaultsInLRU {
	static int k = 0, pageFault = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();

			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = sc.nextInt();
			k = sc.nextInt();
			pageFault = 0;
			Queue<Integer> q = new LinkedList<Integer>();
			Hashtable<Integer, Boolean> h = new Hashtable<>();
			for (int i = 0; i < n; i++) {
				Boolean b = h.get(arr[i]);
				if (b != null) {
					q.remove(arr[i]);
					q.add(arr[i]);
				} else {
					pageFault++;
					if (q.size() == k) {
						h.remove(q.remove());
					}
					q.add(arr[i]);
					h.put(arr[i], true);
				}
			}
			System.out.println(pageFault);
		}
	}
}
