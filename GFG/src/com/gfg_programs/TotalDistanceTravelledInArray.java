package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/total-distance-travelled-in-an-array/0*/
import java.util.Scanner;

public class TotalDistanceTravelledInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int index[] = new int[n + 1];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				index[arr[i]] = i;
			}
			int count = 0;
			for (int i = 2; i < arr.length + 1; i++) {
				count = count + Math.abs(index[i] - index[i - 1]);
			}
			System.out.println(count);
		}
	}
}
