package com.programs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonrepeatingCharacterInStream {
	final static int CHAR_MAX = 26;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int a = sc.nextInt();
			char[] arr = new char[a];

			for (int i = 0; i < a; i++)
				arr[i] = sc.next().charAt(0);

			firstNonRepeating(arr);

		}
	}

	static void firstNonRepeating(char[] str) {
		int[] charCount = new int[CHAR_MAX];
		Queue<Character> q = new LinkedList<Character>();

		for (int i = 0; i < str.length; i++) {
			char c = str[i];
			q.add(c);
			charCount[c - 'a']++;

			while (!q.isEmpty()) {
				if (charCount[q.peek() - 'a'] > 1)
					q.remove();
				else {
					System.out.print(q.peek() + " ");
					break;
				}
			}
			if (q.isEmpty())
				System.out.print(-1 + " ");
		}
		System.out.println();
	}
}
