package com.programs;

/*https://practice.geeksforgeeks.org/problems/n-trailing-zeroes-in-factorials/0/?ref=self*/
import java.util.Scanner;

public class NTrailingZeroesInFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(binSearch(n));
		}
	}

	public static int binSearch(int n) {
		int low = 0, high = (int) 1e6, count = 0;
		while (low < high) {
			int mid = (high + low) / 2;
			int zero = zeros(mid);
			if (zero < n)
				low = mid + 1;
			else
				high = mid;
		}
		while (zeros(low) == n) {
			// System.out.print(low + " ");
			count++;
			low++;
		}
		return count;
	}

	public static int zeros(int n) {
		int count = 0;
		while (n > 0) {
			n /= 5;
			count += n;
		}
		return count;
	}
}
