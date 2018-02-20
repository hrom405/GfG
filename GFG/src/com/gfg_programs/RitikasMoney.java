package com.gfg_programs;

import java.util.HashMap;
import java.util.Scanner;

public class RitikasMoney {
	static HashMap<Long, Long> hm = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			long n = sc.nextInt();
			System.out.println(change(n));
		}
	}

	static long change(long n) {
		if (hm.containsKey(n))
			return hm.get(n);

		else {
			long change = 0;
			if (n >= 12) {
				change = change(n / 2) + change(n / 3) + change(n / 4);
				change = (change > n) ? change : n;
			} else
				return n;

			hm.put(n, change);
			return change;
		}
	}
}
