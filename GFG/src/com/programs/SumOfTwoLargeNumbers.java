package com.programs;

/*https://practice.geeksforgeeks.org/problems/sum-of-numbers-or-number/0/?ref=self*/
import java.math.BigInteger;
import java.util.Scanner;

public class SumOfTwoLargeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger x = sc.nextBigInteger();
			BigInteger y = sc.nextBigInteger();
			BigInteger sum = x.add(y);
			if (sum.toString().length() == x.toString().length())
				System.out.println(sum);
			else
				System.out.println(x);
		}
	}
}
