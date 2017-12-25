package com.programs;
/*https://practice.geeksforgeeks.org/problems/find-sum-of-different-corresponding-bits-for-all-pairs/0*/
import java.util.Scanner;

public class FindSumOfDiffCorrespondingBitsForAllPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sum += check(arr[i]^arr[j]);
				}
			}
			System.out.println(sum);
		}
	}

	private static int check(int num) {
		int count = 0;
		while (num>0)
		{
			count += num & 1;
			num >>= 1;
		}
		return count;
	}
}
