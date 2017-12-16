package com.programs;

import java.math.BigInteger;
import java.util.Scanner;

/*Given a positive integer N, check if N is a power of 2.*/
public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger N = new BigInteger(sc.next());
			if (N.equals(new BigInteger("0"))) {
				System.out.println("NO");
			} else {
				BigInteger n = N.subtract(new BigInteger("1"));
				BigInteger C = N.and(n);
				if (C.equals(new BigInteger("0")))
					System.out.println("YES");

				else
					System.out.println("NO");
			}
		}
		sc.close();
	}

}
