package com.company;

import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class cwh_100_java_time {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);

		LocalTime t = LocalTime.now();
		System.out.println(t);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		// Example
		Clock cl = Clock.systemDefaultZone();
		System.out.println(cl.getZone());
		// abstract Instant instant()
		Clock cl2 = Clock.systemUTC();
		System.out.println(cl2.instant());
		// Duration class
		Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON); // LocalTime.MIN = '00:00' , LocalTime.NOON =
																		// '12:00'
		System.out.println(d1.isNegative());
		Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN); // LocalTime.MAX = '23:59:59.999999999' ,
																		// LocalTime.MIN = '00:00'
		System.out.println(d2.isNegative());
		// isZero()
		Duration d3 = Duration.between(LocalTime.MIN, LocalTime.MIDNIGHT); // LocalTime.MIN = '00:00' , LocalTime.NOON =
																			// '00:00'
		System.out.println(d3.isZero());
		Duration d4 = Duration.between(LocalTime.MAX, LocalTime.MIN); // LocalTime.MAX = '23:59:59.999999999' ,
																		// LocalTime.MIN = '00:00'
		System.out.println(d4.isZero());
		// LocalDate class :
		LocalDate d5 = LocalDate.now();
		System.out.println(d5);
		// compareTo()
		LocalDate dt0 = LocalDate.parse("2021-05-27");
		LocalDate dt1 = LocalDate.parse("2021-05-26");
		LocalDate dt2 = LocalDate.parse("2021-05-26");
		System.out.println(dt1.equals(dt0));
		System.out.println(dt2.equals(dt1));
		// withYear(int Year)
		LocalDate dy = LocalDate.parse("2021-05-27");
		System.out.println("--------------------------------------");
		System.out.println(dy.withYear(2001));
		// LocalTime class
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		// LocalTime plusHours(long hoursToAdd)
		LocalTime ltp = LocalTime.of(13, 18, 29);
		System.out.println("Time before : " + ltp);

		LocalTime ltp1 = ltp.plusHours(5);
		System.out.println("Time after adding 5 hours : " + ltp1);
		// LocalTime minusMinutes(long minutesToSubtract)
		LocalTime ltm = LocalTime.of(15, 28, 19);
		System.out.println("Time before : " + ltm);
		LocalTime ltm1 = ltm.minusMinutes(8);
		System.out.println("Time after subtracting 8 minutes : " + ltm1);
	}
}
