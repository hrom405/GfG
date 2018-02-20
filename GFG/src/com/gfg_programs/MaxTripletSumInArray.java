package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/maximum-triplet-sum-in-array/0/?ref=self*/
import java.util.Scanner;

public class MaxTripletSumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++)
				a[i] = sc.nextInt();
			System.out.println(maxTripletSum(a, n));
		}
	}

	static int maxTripletSum(int arr[], int n) {
		int maxA = 0, maxB = 0, maxC = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] > maxA) {
				maxC = maxB;
				maxB = maxA;
				maxA = arr[i];
			} else if (arr[i] > maxB) {
				maxC = maxB;
				maxB = arr[i];
			} else if (arr[i] > maxC)
				maxC = arr[i];
		}
		return (maxA + maxB + maxC);
	}
}
