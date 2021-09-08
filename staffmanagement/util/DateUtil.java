package com.hsbc.staffmanagement.util;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {
	DateUtil date;
	
	public DateUtil(String dateFormat) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");
	}
	
	public static Date getDateFromString(String string, DateTimeFormatter format) {
//		Date date = 
		return null;
		
	}

}
