package com.programs;

/*https://practice.geeksforgeeks.org/problems/rotate-a-2d-array-without-using-extra-space/0*/
import java.util.Scanner;

public class Rotate2DArrayWithoutUsingExtraSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int s = sc.nextInt();
			int[][] arr = new int[s][s];
			for (int i = 0; i < s; i++)
				for (int j = 0; j < s; j++)
					arr[i][j] = sc.nextInt();

			for (int i = 0; i < s; i++)
				for (int j = s - 1; j >= 0; j--)
					System.out.print(arr[j][i] + " ");
			System.out.println();
		}
	}

}
