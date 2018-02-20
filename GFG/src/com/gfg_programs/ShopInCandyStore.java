package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/shop-in-candy-store/0*/
import java.util.Arrays;
import java.util.Scanner;

public class ShopInCandyStore {
	static int k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			k = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			System.out.print(check(a) + " ");
			revereseArray(a, 0, n - 1);
			System.out.println(check(a));
		}
	}

	public static int check(int[] a) {
		int num = 0;
		int z = a.length - 1;
		int i = 0;
		while (z >= i) {
			num += a[i];
			z -= k;
			i++;
		}
		return num;
	}

	static void revereseArray(int arr[], int start, int end) {
		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		revereseArray(arr, start + 1, end - 1);
	}
}
