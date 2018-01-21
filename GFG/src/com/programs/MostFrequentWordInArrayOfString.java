package com.programs;

/*https://practice.geeksforgeeks.org/problems/most-frequent-word-in-an-array-of-strings/0*/
import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentWordInArrayOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String[] s = new String[n];
			int[] a = new int[n];
			for (int i = 0; i < s.length; i++) {
				s[i] = sc.next();
			}
			Arrays.sort(s);
			int cnt = 1;
			int mcnt = 1;
			String fw = s[0];
			for (int i = 1; i < s.length; i++) {
				if (s[i].equals(s[i - 1]))
					cnt++;
				else
					cnt = 1;

				if (cnt > mcnt) {
					mcnt++;
					fw = s[i];
				}
			}
			System.out.println(fw);
		}
	}
}
