package com.programs;

/*https://practice.geeksforgeeks.org/problems/compute-abc/0/?ref=self*/
import java.math.BigInteger;
import java.util.Scanner;

public class ComputeBigIntegerOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger c = sc.nextBigInteger();

			System.out.println((a.multiply(b)).mod(c));
		}
	}
}
