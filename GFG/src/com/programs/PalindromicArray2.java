package com.programs;

/*You are given an array A of size N. Your task is to find the minimum number of operations needed to convert the given array to 'Palindromic Array'.

Palindromic Array:
[23,15,23] is a ‘Palindromic Array’ but [2,0,1] is not.

The only allowed operation is that you can merge two adjacent elements in the array and replace them with their sum.*/

import java.util.Scanner;

class PalindromicArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			System.out.println(merge(arr, n));
		}
	}

	public static int merge(int arr[], int n) {
		int i = 0, count = 0;
		int j = n - 1;
		while (i <= j) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} else if (arr[i] < arr[j]) {
				i++;
				arr[i] = arr[i] + arr[i - 1];
				count++;
			} else {
				j--;
				arr[j] = arr[j] + arr[j + 1];
				count++;
			}
		}
		return count;
	}
}
