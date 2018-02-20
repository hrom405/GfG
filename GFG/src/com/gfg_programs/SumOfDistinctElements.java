package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/sum-of-distinct-elements/0/?ref=self*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SumOfDistinctElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++)
				m.put(sc.nextInt(), 1);
			int sum = 0;
			Set keys = m.keySet();
			Iterator itr = keys.iterator();
			while (itr.hasNext())
				sum += (int) itr.next();
			System.out.println(sum);
		}
	}
}
