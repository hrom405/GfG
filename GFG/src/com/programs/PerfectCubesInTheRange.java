package com.programs;

/*https://practice.geeksforgeeks.org/problems/perfect-cubes-in-a-range/0/?ref=self*/
import java.util.Scanner;

public class PerfectCubesInTheRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int acrt = (int) Math.cbrt(a);
			int bcrt = (int) Math.cbrt(b);
			int flag = 0;
			for (int i = acrt; i <= bcrt; i++) {
				int val = (int) Math.pow(i, 3);
				if (val >= a && val <= b) {
					System.out.print(val + " ");
					flag = 1;
				}
			}
			if (flag == 1)
				System.out.println();
			else
				System.out.println("No");
		}
	}
}
