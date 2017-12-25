package com.programs;

/*https://practice.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string/0/?ref=self*/
import java.util.Scanner;

public class MaxDifferenceOf0sAnd1sInBinaryStringSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			// StringBuffer str = new StringBuffer(sc.nextLine());
			String str = sc.nextLine();
			int max = -1;
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '0')
					count++;
				if (max < count)
					max = count;
				if (str.charAt(i) == '1')
					count--;
				if (count < 0)
					count = 0;
			}
			if (max == 0)
				System.out.println(-1);
			else
				System.out.println(max);

		}

	}
}
