package com.programs;

import java.util.Scanner;

/*Jeny love Sweets so much. Now she is at famous restaurant and wants to eat M pieces of a particular sweet.
 *  Cost of nth sweet can only be determined by the determinant of matrix of order n x n, where n = 1 to M.
 *   The (i, j)th term of matrix is given as:
 *    A[i][j]= minimum(i, j) *(-1)((i-1)*n + (j-1)).
 *     Matrix indexes starts with 1. The task is to find the cost of M sweets.*/
public class CostOfSweets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			if (n == 1)
				System.out.println("1");
			else if (n == 1)
				System.out.println("0");
			else {
				n -= 2;
				System.out.println(((int) n / 4) * 2 + n % 4);
			}
		}
	}
}
