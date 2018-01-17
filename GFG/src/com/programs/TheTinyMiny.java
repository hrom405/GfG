package com.programs;

/*https://practice.geeksforgeeks.org/problems/the-tiny-miny/0*/
import java.util.Arrays;
import java.util.Scanner;

public class TheTinyMiny {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0;
			StringBuilder builder = new StringBuilder();
			for (int i = 1; i <= n; i++) {
				sum = (int) Math.pow(a, i);
				builder.append(sum + "");
			}
			int len = builder.toString().length();
			String str = builder.toString();
			// System.out.println(str);
			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = str.charAt(i) - '0';
			}
			Arrays.sort(arr);
			// System.out.println(Arrays.toString(arr));
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0)
					System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
}
