package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SortingElementsByFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			Map<Integer, Integer> ht = new HashMap<>();
			for (int i = 1; i <= 60; i++) {
				int cnt = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == i)
						cnt++;
				}
				if (cnt != 0)
					ht.put(i, cnt);
			}

			Set<Entry<Integer, Integer>> entries = ht.entrySet();

			Comparator<Entry<Integer, Integer>> valueComparator = new Comparator<Entry<Integer, Integer>>() {
				@Override
				public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
					int v1 = e1.getValue();
					int v2 = e2.getValue();
					return v2 - v1;
				}
			};
			List<Entry<Integer, Integer>> listOfEntries = new ArrayList<Entry<Integer, Integer>>(entries);
			Collections.sort(listOfEntries, valueComparator);
			LinkedHashMap<Integer, Integer> sortedByValue = new LinkedHashMap<Integer, Integer>(listOfEntries.size());
			for (Entry<Integer, Integer> entry : listOfEntries) {
				sortedByValue.put(entry.getKey(), entry.getValue());
			}
			Set<Entry<Integer, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
			for (Entry<Integer, Integer> mapping : entrySetSortedByValue) {
				// System.out.println(mapping.getKey() + " " + mapping.getValue());
				for (int i = 0; i < mapping.getValue(); i++) {
					System.out.print(mapping.getKey() + " ");
				}
			}
			System.out.println();
		}
	}
}
