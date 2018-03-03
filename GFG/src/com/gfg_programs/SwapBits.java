package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/swap-every-two-bits-in-bytes/0*/
import java.util.Scanner;

public class SwapBits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = Integer.toBinaryString(sc.nextInt());
			if (s.length() % 2 == 1)
				s = new String("0" + s);

			char[] n = s.toCharArray();

			for (int i = 0; i < n.length; i += 2) {
				char temp = n[i];
				n[i] = n[i + 1];
				n[i + 1] = temp;
			}
			System.out.println(Integer.parseInt(new String(n), 2));
		}
	}
}