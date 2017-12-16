package com.programs;

/*Given a positive integer N, print count of set bits in it.
 *  For example, if the given number is 6, output should be 2 as there are two set bits in it.*/
import java.util.Scanner;

public class SetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String s = Integer.toBinaryString(n);
			int cnt = 0;

			for (int i = 0; i < s.length(); i++)
				if (s.charAt(i) == '1')
					cnt++;

			System.out.println(cnt);
		}
	}
}
