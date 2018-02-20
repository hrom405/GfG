package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/remove-leading-zeros-from-an-ip-address/0/?ref=self*/
import java.util.Scanner;

public class RemoveLeading0sFromIPofAnAddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			String[] s = str.split("\\.+");
			/*
			 * for (String a : s) System.out.println(a);
			 */
			for (int i = 0; i < s.length; i++) {
				String part = Integer.parseInt(s[i]) + "";
				System.out.print(part + ((i < s.length - 1) ? "." : ""));
			}
			System.out.println();
		}
	}
}
