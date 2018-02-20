package com.gfg_programs;
/*Given an unsorted array having both negative and positive integers. 
 * The task is place all negative element at the end of array without changing the order of positive element and negative element.*/
import java.util.Scanner;

public class MoveNegativeElementsToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int[] ab = new int[n];
			int cnt = 0;

			for (int i = 0; i < n; i++)
				if (a[i] >= 0)
					ab[cnt++] = a[i];
			
			for (int i = 0; i < n; i++)
				if (a[i] < 0)
					ab[cnt++] = a[i];
			// System.out.println(Arrays.toString(ab));
			for (int i = 0; i < n; i++)
				System.out.print(ab[i] + " ");
			System.out.println();

		}
	}
}
