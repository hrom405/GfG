package com.programs;

/*https://practice.geeksforgeeks.org/problems/rope-cutting/0/?ref=self*/
import java.util.Scanner;

public class RopeCutting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int cnt = 0;
			int min = 0;
			for (int i = 0; i < a.length; i++) {
				min = min(a);
				// System.out.println("min-->" + min);
				cnt = 0;
				for (int j = 0; j < a.length; j++) {
					a[j] -= min;
					if (a[j] > 0)
						cnt++;
				}
				// System.out.println(Arrays.toString(a));
				if (cnt == 0)
					break;
				System.out.print(cnt + " ");
			}
			System.out.println();

		}
	}

	public static int min(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				min = Integer.min(min, a[i]);
		}
		return min;
	}
}
