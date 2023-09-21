package com.company;

import java.util.*;

public class cwh_98_Calendar_Class {
	public static void main(String[] args) {
		// Example to demonstrate the getInstance() method
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.getCalendarType()); // getCalendarType() returns the type of the calendar
		// Methods of the Calendar class
		Calendar c = Calendar.getInstance();
		System.out.println("Current year is :" + c.get(Calendar.YEAR));
		System.out.println("Current month is :" + c.get(Calendar.MONTH)); // The indexing for month field ranges from
																			// [0,11]
		System.out.println("Current day is :" + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Current hour is :" + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("Current minute is :" + c.get(Calendar.MINUTE));
		System.out.println("Current second is :" + c.get(Calendar.SECOND));
		// add(int field, int amount)
		Calendar c2 = Calendar.getInstance();
		System.out.println("Current date is : " + c2.getTime());
		c2.add(Calendar.YEAR, 4);
		System.out.println("After 4 years  : " + c2.getTime());
		c2.add(Calendar.YEAR, -12);
		System.out.println("Before 12 years  : " + c2.getTime());
		c2.add(Calendar.MONTH, 2);
		System.out.println("After 2 months  : " + c2.getTime());
		// getWeeksInWeekYear()
		Calendar c3 = Calendar.getInstance();
		System.out.println(c3.getWeeksInWeekYear());
		// getMaximum(int field)
		Calendar c4 = Calendar.getInstance();
		System.out.println("The maximum no. of weeks in a year : " + c4.getMaximum(Calendar.WEEK_OF_YEAR));
	}

}
