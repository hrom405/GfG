package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/nearest-multiple-of-10/0/?ref=self*/
import java.math.BigInteger;
import java.util.Scanner;

public class NearestMultipleOf10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger n = sc.nextBigInteger();
			BigInteger ten = new BigInteger("10");
			BigInteger five = new BigInteger("5");
			BigInteger r = n.remainder(BigInteger.valueOf(10));
			if (r.compareTo(five) < 1)
				System.out.println(n.subtract(r));
			else {
				r = ten.subtract(r);
				System.out.println(n.add(r));
			}
		}
	}
}
