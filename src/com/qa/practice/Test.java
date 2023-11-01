package com.qa.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat();
		Date date = new Date();
		String dt = formatter.format(date);
		System.out.println(dt);
		System.out.println("----------");
		GregorianCalendar c = new GregorianCalendar();
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MINUTE));
		//System.out.println(c.get(Calendar.MONTH));
		
	}
}