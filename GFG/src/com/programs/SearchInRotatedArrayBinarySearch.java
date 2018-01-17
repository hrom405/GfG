package com.programs;

/*https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array/0/?ref=self*/
import java.util.Scanner;

public class SearchInRotatedArrayBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(search(a, 0, n - 1, k));
		}
	}

	static int search(int arr[], int l, int h, int key) {
		if (l > h)
			return -1;

		int mid = (l + h) / 2;
		if (arr[mid] == key)
			return mid;

		if (arr[l] <= arr[mid]) {
			if (key >= arr[l] && key <= arr[mid])
				return search(arr, l, mid - 1, key);

			return search(arr, mid + 1, h, key);
		}

		if (key >= arr[mid] && key <= arr[h])
			return search(arr, mid + 1, h, key);

		return search(arr, l, mid - 1, key);
	}
}
