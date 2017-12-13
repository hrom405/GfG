package com.programs;

import java.util.Scanner;

/*Today is 10th class Maths Pre-Board exam and the students are arranged in a classroom forming N rows and M columns. There are two sets in Maths paper : SET-A and SET-B. The invigilator of the class being a new teacher, doesn't know the rules of distributing papers. So, he distributed the question papers (by mixing both the sets) randomly. Soon, he is being informed by one of the students the rule of distributing the paper which is that no adjacent students should get the same set of paper i.e. if a student gets a SET-A then the other students adjacent to him should get SET-B to avoid cheating.

Now since the paper is already distributed. The invigilator will have to exchange the sets of some students to ensure that no two adjacent students get the same set. Find the minimum number of students whose sets will be exchanged by the invigilator so that no two adjacent students have the same sets.

Two students are adjacent if they share one of their common sides (left,right,front or back if exists).*/

public class DistributingQuestionPapers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			char[][] a = new char[N][M];

			for (int i = 0; i < N; i++)
				for (int j = 0; j < M; j++)
					a[i][j] = sc.next().charAt(0);

			System.out.println(check(a, N, M));

		}
	}

	private static int check(char[][] a, int N, int M) {
		int cnt1 = 0, cnt2 = 0, ret = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
					if (a[i][j] != 'A')
						cnt1++;
				if ((i % 2 == 1 && j % 2 == 0) || (i % 2 == 0 && j % 2 == 1))
					if (a[i][j] != 'B')
						cnt1++;

				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
					if (a[i][j] != 'B')
						cnt2++;
				if ((i % 2 == 1 && j % 2 == 0) || (i % 2 == 0 && j % 2 == 1))
					if (a[i][j] != 'A')
						cnt2++;
			}
		}
		ret = cnt1 > cnt2 ? cnt2 : cnt1;
		return ret;
	}

}
