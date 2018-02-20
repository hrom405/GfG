package com.gfg_programs;

/*Print a sequence of numbers starting with N, without using loop, in which  A[i+1] = A[i] - 5,  
 * if  A[i]>0, else A[i+1]=A[i] + 5  repeat it until A[i]=N.*/
import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			pattern(n);
			System.out.println();
		}
	}

	static void pattern(int n) {
		if (n == 0 || n < 0) {
			System.out.print(n + " ");
			return;
		}
		System.out.print(n + " ");
		pattern(n - 5);
		System.out.print(n + " ");
	}
}
