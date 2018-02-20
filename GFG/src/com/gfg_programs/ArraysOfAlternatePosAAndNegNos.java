package com.gfg_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysOfAlternatePosAAndNegNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			// int[] a = new int[n];
			ArrayList<Integer> pos = new ArrayList<>();
			ArrayList<Integer> neg = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int num = sc.nextInt();
				if (num < 0)
					neg.add(num);
				else
					pos.add(num);
			}
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0 && !pos.isEmpty())
					System.out.print(pos.get(i / 2) + " ");
				else if (!neg.isEmpty() && i % 2 == 1)
					System.out.print(neg.get(i / 2) + " ");
			}
			System.out.println();
		}
	}
}
