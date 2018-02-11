package com.programs;

/*https://practice.geeksforgeeks.org/problems/value-equal-to-index-value/0/?ref=self*/
import java.util.ArrayList;
import java.util.Scanner;

public class ValueEqualToIndexValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			ArrayList<Integer> al = new ArrayList<>();
			int flag = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				if (a[i] == i + 1) {
					flag = 1;
					al.add(a[i]);
				}
			}
			if (flag == 1)
				for (int i = 0; i < al.size(); i++) {
					System.out.print(al.get(i) + " ");
				}
			else
				System.out.print("Not Found");
			System.out.println();
		}
	}
}
