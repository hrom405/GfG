package com.programs;

/*https://practice.geeksforgeeks.org/problems/mystic-falls-school/0*/
import java.util.Scanner;

public class MysticFallsSchool {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println((k - n) - 1);
		}
	}
}
