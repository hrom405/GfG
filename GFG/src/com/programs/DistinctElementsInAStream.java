package com.programs;

import java.util.HashMap;
import java.util.Scanner;

public class DistinctElementsInAStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			HashMap<Integer, Integer> hm = new HashMap<>();
			for (int i = 0; i < n; i++) {
				char ch = sc.next().charAt(0);
				int num = sc.nextInt();
				if (ch == 'A') {
					if (hm.containsKey(num))
						hm.put(num, hm.get(num) + 1);
					else
						hm.put(num, 1);
				} else if (ch == 'R') {
					if (hm.containsKey(num)) {
						int curr_freq = hm.get(num);
						curr_freq--;

						if (curr_freq == 0)
							hm.remove(num);
						else
							hm.put(num, curr_freq);
					}
				}
				System.out.println(hm.size());
			}
		}
	}

}
