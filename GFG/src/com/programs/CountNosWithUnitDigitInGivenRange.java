package com.programs;

import java.util.Scanner;

public class CountNosWithUnitDigitInGivenRange {
	static double startTime;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int low = sc.nextInt();
			int high = sc.nextInt();
			int k = sc.nextInt();
			startTime=System.currentTimeMillis();
			check(low, high, k);
			
		}
	}

	private static void check(int low, int high, int k) {
		int cnt = 0;
		int n =0;
		int llow=low;
		/*for (int i = low; i <= high; i++) {
			if (i % 10 == k) {
				System.out.println(i);
				cnt++;
			}
		}*/
		if(k<low) {
			n=llow;
			while(llow%10!=k) {
				llow++;
			}
			k=llow;
		}
		//System.out.println("llow==>" + llow);
		while(k<=high && k>=low) {
			//System.out.println(k);
			k+=10;
			cnt++;
		}
		System.out.println(cnt);
	}

}
