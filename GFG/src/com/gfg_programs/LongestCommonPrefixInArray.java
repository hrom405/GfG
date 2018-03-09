package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array/0*/
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefixInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int size = sc.nextInt();
			String[] arr = new String[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.next();
			}
			if (size == 1) {
				System.out.println(arr[0]);
				continue;
			}
			Arrays.sort(arr);

			int f = arr[0].length();
			int s = arr[size - 1].length();
			int l = Math.min(f, s);
			int i = 0;
			while (i < l && arr[0].charAt(i) == arr[size - 1].charAt(i)) {
				i++;
			}
			if (i != 0)
				System.out.println(arr[0].substring(0, i));
			else
				System.out.println(-1);
		}
	}
}
