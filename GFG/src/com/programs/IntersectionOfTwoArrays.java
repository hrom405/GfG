package com.programs;

/*https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays/0/?ref=self*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[] aa = new int[a];
			int[] bb = new int[b];
			for (int i = 0; i < a + b; i++) {
				if (i < a)
					aa[i] = sc.nextInt();
				else
					bb[i - a] = sc.nextInt();
			}
			int flag = 0;
			ArrayList<Integer> al = new ArrayList<>();
			// System.out.println(Arrays.toString(aa) + "\n" + Arrays.toString(bb));
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (aa[i] == bb[j]) {
						flag = 1;
						// System.out.print(aa[i] + " ");
						al.add(aa[i]);
					}
				}
			}
			if (flag == 0)
				System.out.println("Zero");
			else {
				int[] ab = new int[al.size()];
				for (int i = 0; i < ab.length; i++)
					ab[i] = al.get(i);
				Arrays.sort(ab);
				for (int i = 0; i < ab.length; i++)
					System.out.print(ab[i] + " ");
				System.out.println();
			}
		}
	}
}
