package com.gfg_programs;

/*Given an array of integers, sort the array into a wave like array and return it. 
 *In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

 * Example

 * Given [1, 2, 3, 4]

 * One possible answer : [2, 1, 4, 3]
 * Another possible answer : [4, 1, 3, 2]
 * NOTE : If there are multiple answers possible, return the one thats lexicographically smallest.*/
import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			Arrays.sort(a);

			for (int i = 0; i < n; i += 2) {
				if (i < n - 1) {
					int t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
			// System.out.println(Arrays.toString(a));
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();
		}
	}
}
