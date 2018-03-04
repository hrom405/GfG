package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/ishaan-loves-chocolates/0*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IshaanChocolates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int j = 0; j < n; j++)
				al.add(sc.nextInt());
			System.out.println(Collections.min(al));
		}
	}
}
