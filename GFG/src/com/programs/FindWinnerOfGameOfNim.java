package com.programs;
/*In Game of Nim, two players take turns removing objects from heaps or the pile of stones.
 * Suppose two players A and B are playing the game. Each is allowed to take only one stone from the pile. 
 * The player who picks the last stone of the pile will win the game. 
 * Given N the number of stones in the pile, the task is to find the winner, if player A starts the game .*/

import java.util.Scanner;

public class FindWinnerOfGameOfNim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			if (n % 2 == 0)
				System.out.println("Player B");
			else
				System.out.println("Player A");
		}
	}
}
