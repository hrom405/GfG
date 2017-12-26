package com.programs;
/*https://practice.geeksforgeeks.org/problems/floating-point-number-even-or-odd/0/?ref=self*/
import java.util.Scanner;

public class FloatingPointNoEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  t= sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			
			if(check(s))
				System.out.println("EVEN");
			else
				System.out.println("ODD");
		}
	}
	public static boolean check(String s)
    {
        int l = s.length();
        char[] ca = s.toCharArray();
        boolean dotSeen = false;
        for (int i = l - 1; i >= 0; i--) {
 
            if (ca[i] == '0' && dotSeen == false)
                continue;
            if (ca[i] == '.') {
                dotSeen = true;
                continue;
            }
            if ((ca[i] - '0') % 2 == 0)
                return true;
 
            return false;
        }
        return false;
    }
}
