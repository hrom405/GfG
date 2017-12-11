package com.programs;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			String str;
			str = sc.nextLine();
			str = str.replace(" ", "");
			System.out.println(str);
		}
	}
}
