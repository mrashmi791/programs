package com.practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentime {

	public static void main(String[] args) {

//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(dtf.format(now));
//		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  
	    Instant instant = Instant.ofEpochMilli(date.getTime());
	    LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
	    System.out.println("LocalDateTime from Instant :\n" + ldt);
	    }

}
