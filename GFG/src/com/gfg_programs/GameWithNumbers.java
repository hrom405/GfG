package com.gfg_programs;

/*https://www.codechef.com/LTIME57/problems/GAMENUMB*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameWithNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			int[] d = new int[n];
			int[] b = new int[k];
			// int num_of_cards = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			// Arrays.sort(a);
			for (int i = 0; i < d.length; i++) {
				d[i] = sc.nextInt();
				// num_of_cards += d[i];
			}
			for (int i = 0; i < b.length; i++) {
				b[i] = sc.nextInt();
			}
			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				while (d[i] != 0) {
					al.add(a[i]);
					d[i]--;
				}
			}
			Collections.sort(al);

			for (int i = 0; i < k; i++) {
				if (i + 1 % 2 == 1) {
					for (int j = 0; j <= 0 + (al.size() - b[i]); j++) {
						al.remove(0);
					}
					// System.out.println(al.toString());
				} else {
					for (int j = 0; j <= (al.size() - b[i] + 1); j++) {
						al.remove(al.size() - 1);
						System.out.println(al.toString());
					}
					// System.out.println(al.toString());
				}
			}
			// System.out.println(al.toString());
			int sum = 0;
			for (int i : al) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}
