package com.gfg_programs;
/*Given a series of numbers  6 , 14 , 36 , 98 , 276  ... , 
 * Identify the pattern in the series and help to identify integers at other indices . Indices are starting from 1 */

import java.math.BigInteger;
import java.util.Scanner;

public class InterestingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			System.out.println(num(n).toString());
		}
	}

	static BigInteger num(int i) {
		BigInteger b1 = BigInteger.valueOf(1);
		BigInteger b2 = BigInteger.valueOf(2);
		b2 = b2.pow(i);
		BigInteger b3 = BigInteger.valueOf(3);
		b3 = b3.pow(i);
		BigInteger ans = BigInteger.valueOf(0);
		ans = ans.add(b2);
		ans = ans.add(b3);
		ans = ans.add(b1);
		return ans;
	}

}
