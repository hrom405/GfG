package com.gfg_programs;

/*https://practice.geeksforgeeks.org/problems/numbers-with-prime-frequencies-greater-than-or-equal-to-k/0*/
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberWithPrimeFreqGreaterOnEqualToK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			check(a, k);
			System.out.println();
		}
	}

	static void check(int[] arr, int k) {
		Map<Integer, Integer> map = new TreeMap<>();
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];

			int freq;
			if (map.containsKey(val)) {
				freq = map.get(val);
				freq++;
			} else
				freq = 1;
			map.put(val, freq);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			if (isPrime(value) && value >= k) {
				System.out.print(entry.getKey() + " ");
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.print(-1);
	}

	public static boolean isPrime(int i) {
		int factors = 0;
		int j = 1;

		while (j <= i) {
			if (i % j == 0) {
				factors++;
			}
			j++;
		}
		return (factors == 2);
	}
}
