package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/smallest-number/0/?ref=self*/
import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			int sum;
			boolean h = false;
			for (int i = (int) Math.pow(10, (d - 1)); i <= (int) Math.pow(10, d); i++) {
				String str = String.valueOf(i);
				// System.out.println(str);
				char[] a = str.toCharArray();
				// System.out.println(Arrays.toString(a));
				sum = 0;
				for (int j = 0; j < a.length; j++) {
					sum += Character.getNumericValue(a[j]);

				}
				// System.out.println(sum);
				if (sum == s) {
					System.out.println(i);
					h = true;
					break;
				}
			}
			if (h == false) {
				System.out.println(-1);
			}
		}
	}

}
