package com.gfg_programs;
/*Tony Stark ( Iron Man ) is a fun loving and a responsible avenger too. After fighting the civil war, he needs rest and needs to fresh up his mind.
 *  So he makes up his mind to go to a casino and play. 
 *  When he reaches there, he finds out people are mad for a gambling on numbers game named as "BAAZI". 
 *  Tony being an observant guy tries to observe the pattern in numbers. 
 *  Like someone who gambled on 4 ,  6 , 12  , 18 , 30 , 42 , 198  won  the game  whereas the one who gambled on 1 , 2 , 3 , 5 , 7 , 8 , 9 , 10 , 11, 13 ... lost all his money.
 *   You have to help Tony play this game, by telling him whether he should play on the number he ( Tony ) decided to.*/

import java.util.Scanner;

public class GamblingStark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			System.out.println(check(n));
		}
	}

	private static char check(int n) {
		int a = n - 1;
		int b = n + 1;

		if (checkPrime(a) == true && checkPrime(b) == true || n == 2)
			return 'Y';
		else
			return 'N';
	}

	static boolean checkPrime(int n) {
		int i, m = 0, flag = 0;
		boolean hai = false;
		m = n / 2;
		if (n == 0 || n == 1) {
			hai = false;

		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					// hai = false;
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				hai = true;
			}
		}
		return hai;
	}
}
