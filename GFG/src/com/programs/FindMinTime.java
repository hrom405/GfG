package com.programs;
/*Davis who has number of scanners in his shop select only two scanners to scan the documents of a customer.
 *  When a customer comes to his shop he knows three parameters S1, S2 and N. 
 *   S1 and S2 are the time taken by scanner 1 and scanner 2 to scan one document respectively And N is the number of documents given by the customer.
 *    As he is suppose to entertain a number of customers, he wants to calculate the minimum time to scan all the N documents using those two scanners.*/

import java.util.Scanner;

public class FindMinTime {
	static int max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			int n = sc.nextInt();
			max = s2 * n;
			;
			for (int i = 0; i <= n; i++) {
				int a = 0, b = 0, c = 0;
				a = (n - i) * s1;
				b = i * s2;
				if (a > b)
					c = a;
				else
					c = b;
				if (max > c)
					max = c;
			}
			System.out.println(max);
			
		}
	}

}
