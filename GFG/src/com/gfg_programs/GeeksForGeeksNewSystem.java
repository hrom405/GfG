package com.gfg_programs;

/*GeeksforGeeks developed its new system to make sure no two usernames are same. 
 * So, they selected you as a developer to develop the system. 
 * They have set some rules to do the same.
 * Rules are pretty simple: If you see the same username that already exists, 
 * just add a number at the end of that username (number starting from 1), else you will toast "Verified".*/
import java.util.HashMap;
import java.util.Scanner;

public class GeeksForGeeksNewSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String st[] = new String[n];
			for (int i = 0; i < n; i++) {
				st[i] = sc.next();
			}
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (String string : st) {
				if (map.containsKey(string)) {
					map.put(string, map.get(string) + 1);
					System.out.print(string + map.get(string) + " ");
				} else {
					map.put(string, 0);
					System.out.print("Verified ");
				}
			}
			System.out.println("");
		}
	}
}
