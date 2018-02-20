package com.gfg_programs;

import java.util.Arrays;

public class MakeMatrixBeautiful {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, 
					  { 4, 2, 3 }, 
					  { 3, 2, 1 } };
		int row = 0;
		int col = 0;
		int max = 0;
		int k=0;
		int[] ab = new int[3*2];
		for (int i = 0; i < a.length; i++) {
			row = 0;
			col = 0;
			for (int j = 0; j < a.length; j++) {
				row += a[i][j];
				col += a[j][i];
			}
			ab[k]=row;
			ab[k+1]=col;
			if(k<=3) {
				k+=2;
			}
			if (row > col && row > max) {
				max = row;
			}
			if (col > row && col > max) {
				max = col;
			}
		}
		System.out.println(max);
		System.out.println(Arrays.toString(ab));
	}
	public int rowSum(int[][] a,int i,int j) {
		int rs =0;
		
		
		return rs;
	}
}
