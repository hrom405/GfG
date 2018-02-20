package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k/0/?ref=self*/
import java.util.Scanner;

public class CountSubarraysHavingProductLessThanK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int res = 0;
			long p = 1;
			for (int start = 0, end = 0; end < n; end++) {
				p *= a[end];

				while (start < end && p >= k)
					p /= a[start++];

				if (p < k) {
					res = res + (end - start) + 1;
				}
			}
			System.out.println(res);
		}
	}
}
