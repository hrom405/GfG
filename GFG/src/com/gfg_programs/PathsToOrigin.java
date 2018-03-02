package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/paths-to-reach-origin/0*/
import java.util.Scanner;

public class PathsToOrigin {

	public static int countPaths(int a, int b) {
		if (a == 0 || b == 0)
			return 1;
		else
			return (countPaths(a - 1, b) + countPaths(a, b - 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(countPaths(a, b));
		}
	}
}
