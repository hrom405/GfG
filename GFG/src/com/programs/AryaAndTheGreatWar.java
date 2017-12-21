package com.programs;

/*https://practice.geeksforgeeks.org/problems/arya-and-the-great-war/0*/
import java.util.Scanner;

public class AryaAndTheGreatWar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String s = String.valueOf(Integer.toBinaryString(n));
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1')
					cnt++;
			}
			System.out.println(cnt);
		}
	}

}
