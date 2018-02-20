package com.gfg_programs;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		for (int i = 0; i < t; i++) {
			String s = in.nextLine();
			s = s.replace(" ", "");
			System.out.println(s);
		}
	}
}
