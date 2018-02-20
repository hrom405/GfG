package com.gfg_programs;
/*Given an unsorted array having both negative and positive integers. 
 * The task is place all negative element at the end of array without changing the order of positive element and negative element.*/

import java.util.ArrayList;
import java.util.Scanner;

public class MoveNegativeElementsToEnd2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			
			ArrayList<Integer> pos = new ArrayList<Integer>();
	        ArrayList<Integer> neg = new ArrayList<Integer>();
	        int temp;
	        for(int i=0;i<n;i++){
	            temp = a[i];
	            if(temp<0)  neg.add(temp);
	            else    pos.add(temp);
	        }
	        for(int i=0;i<pos.size();i++)
	            System.out.print(pos.get(i)+" ");
	        for(int i=0;i<neg.size();i++)
	            System.out.print(neg.get(i)+" ");
	            System.out.println();
		}
	}
}
