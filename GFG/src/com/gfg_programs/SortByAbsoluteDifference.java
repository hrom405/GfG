package com.gfg_programs;

/*Given an array of N distinct elements and a number K, write a program to arrange array elements according to the absolute difference with K,
 *  i. e., element having minimum difference comes first and so on.
Note : If two or more elements are at equal distance arrange them in same sequence as in the given array.*/
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SortByAbsoluteDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			Integer[] a = new Integer[N];
			for (int i = 0; i < N; i++)
				a[i] = sc.nextInt();

			Arrays.sort(a, new Comparator<Integer>() {
				public int compare(Integer a, Integer b) {
					return Math.abs(K - a) - Math.abs(K - b);
				}
			});
			for (int i = 0; i < N; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}
}