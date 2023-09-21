package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwh_99_gregorian {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.isLeapYear(2018));
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[1]);
		System.out.println(TimeZone.getAvailableIDs()[2]);
		// isLeapYear(int year)
		GregorianCalendar cal2 = new GregorianCalendar();
		System.out.println(cal2.isLeapYear(2000));
		System.out.println(cal2.isLeapYear(2021));
		// roll(int field, boolean up)
		GregorianCalendar c5 = new GregorianCalendar();
		System.out.println("Date before rolling : " + c5.getTime());
		c5.roll(Calendar.MONTH, true);
		c5.roll(Calendar.DATE, false);
		c5.roll(Calendar.YEAR, true);
		System.out.println("Date after rolling : " + c5.getTime());
		// hashcode():
		GregorianCalendar c6 = new GregorianCalendar();
		System.out.println("Calendar : " + c6.getTime());
		System.out.println("The hashcode for this calendar is : " + c6.hashCode());
	}
}
