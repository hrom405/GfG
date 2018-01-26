package com.programs;

/*https://practice.geeksforgeeks.org/problems/anshumans-favourite-number/0/?ref=self*/
import java.util.Scanner;

public class AnshumansFavNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextInt();
			if (Math.abs(n) % 5 == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
