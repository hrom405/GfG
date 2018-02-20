package com.gfg_programs;

/*https://www.hackerrank.com/challenges/java-date-and-time/problem*/
import java.util.Calendar;
import java.util.Scanner;

public class JavaDateTime {

	public static String getDay(String day, String month, String year) {
		String Day[] = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		return Day[dayOfWeek - 1];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));
	}
}
