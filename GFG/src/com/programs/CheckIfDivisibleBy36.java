package com.programs;

/*https://practice.geeksforgeeks.org/problems/check-if-divisible-by-36/0/?ref=selfF*/
import java.math.BigInteger;
import java.util.Scanner;

public class CheckIfDivisibleBy36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger n = sc.nextBigInteger();
			if (n.mod(new BigInteger("36")) == BigInteger.ZERO)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
