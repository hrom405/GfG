package com.programs;

import java.util.Arrays;
import java.util.Scanner;

class PairsWithSpecificDifference {
	public static void main(String[] args) {
		PairsWithSpecificDifference obj = new PairsWithSpecificDifference();
		obj.processInput();
	}

	public void processInput() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int arrSize = sc.nextInt();
			int[] arr = new int[arrSize];
			for (int j = 0; j < arrSize; j++) {
				arr[j] = sc.nextInt();
			}
			int k = sc.nextInt();
			int maxSum = getMaxSum(arr, k);
			System.out.println(maxSum);
		}
		sc.close();
	}

	public int getMaxSum(int[] arr, int k) {
		Arrays.sort(arr);

		int sum = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] - arr[i - 1] < k) {
				sum += arr[i] + arr[i - 1];
				i--;
			}
		}
		return sum;
	}
}