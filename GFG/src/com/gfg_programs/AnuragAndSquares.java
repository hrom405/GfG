package com.gfg_programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnuragAndSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long peri = 0;
		int[] a = new int[(int) Math.pow(10, 6)];
		a[0] = 4;
		a[1] = 6;
		int cnt = 8;
		for (int i = 2; i < (int) Math.pow(10, 6); i += 2) {
			a[i] = cnt;
			a[i + 1] = cnt;
			cnt += 2;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[n - 1]);
	}
}
