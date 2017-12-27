package com.programs;

/*https://practice.geeksforgeeks.org/problems/multiply-two-polynomals/0/?ref=self*/
import java.util.Scanner;

public class Multiply2Polynomials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[] arr = new int[a];
			int[] brr = new int[b];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < brr.length; i++) {
				brr[i] = sc.nextInt();
			}

			int[] crr = new int[a + b - 1];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < brr.length; j++) {
					crr[i + j] += arr[i] * brr[j];
				}
			}
			// System.out.println(Arrays.toString(crr));
			for (int i = 0; i < crr.length; i++) {
				System.out.print(crr[i] + " ");
			}
			System.out.println();
		}
	}

}
