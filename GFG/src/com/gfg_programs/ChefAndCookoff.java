package com.gfg_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndCookoff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < t * 5; i++) {
			al.add(sc.nextInt());
		}
		// System.out.println(al.toString());

		for (int i = 0; i < t * 5; i += 5) {
			int[] res = new int[5];
			for (int j = 0; j < 5; j++) {
				res[j] = al.get(i + j);
			}
			// System.out.println(Arrays.toString(res));
			System.out.println(catagorise(res));
		}
	}

	public static String catagorise(int[] workdone) {
		int performance = 0;
		for (int i : workdone) {
			if (i == 1) {
				performance++;
			}
		}
		return check(performance);
	}

	static String check(int cnt) {
		if (cnt == 0)
			return "Beginner";
		if (cnt == 1)
			return "Junior Developer";
		if (cnt == 2)
			return "Middle Developer";
		if (cnt == 3)
			return "Senior Developer";
		if (cnt == 4)
			return "Hacker";
		else
			return "Jeff Dean";

	}
}
