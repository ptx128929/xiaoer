package com.pengtianxiang.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateutil {
	
	
	public static String getDateByInitMonth(Date date) {
		SimpleDateFormat format = new  SimpleDateFormat("yyyy-MM-dd");
		 String format2 = format.format(date);
		 
		return format2;
		
	}
	
	public static Date getDateByFullMonth(Date src){
		SimpleDateFormat format = new  SimpleDateFormat("yyyy-MM-dd");
		int minutes = src.getMinutes();
		src.getDate();
		src.getSeconds();
		return src;
	
		}


}
