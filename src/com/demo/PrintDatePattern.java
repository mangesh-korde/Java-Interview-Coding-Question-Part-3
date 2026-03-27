package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDatePattern {

	public static void main(String[] args) {
		
		String pattern="MM-dd-yyyy";
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		String format = simpleDateFormat.format(new Date());
		
		System.out.println(format);
	}
}
