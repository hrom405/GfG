package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps/0/?ref=self*/
import java.util.Scanner;

public class MinNumberOfJumpsDynamicProgram {

	static int minJumps(int[] arr, int a) {
		int[] min_jumps = new int[a];
		if (a == 0 || arr[0] == 0) {
			return -1;
		}
		min_jumps[0] = 0;
		for (int i = 1; i < a; i++) {
			min_jumps[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if (i <= j + arr[j] && min_jumps[j] != Integer.MAX_VALUE) {
					min_jumps[i] = Math.min(min_jumps[i], min_jumps[j] + 1);
					break;
				}
			}
		}
		if (min_jumps[a - 1] != Integer.MAX_VALUE)
			return min_jumps[a - 1];
		else
			return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(minJumps(a, n));
		}
	}
}
