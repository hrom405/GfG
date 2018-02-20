package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names/0/?ref=self*/
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WinnerOfElection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String[] votes = new String[n];
			for (int i = 0; i < votes.length; i++) {
				votes[i] = sc.next();
			}
			TreeMap<String, Integer> hm = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				if (hm.get(votes[i]) == null) {
					hm.put(votes[i], 1);
				} else {
					hm.put(votes[i], hm.get(votes[i]) + 1);
				}
			}
			// System.out.println(hm.toString());
			int max = -1;
			String res = "";
			for (Map.Entry<String, Integer> entry : hm.entrySet()) {
				if (entry.getValue() != null && entry.getValue() > max) {
					res = entry.getKey();
					max = entry.getValue();
				}
			}
			System.out.println(res + " " + max);
		}
	}
}
