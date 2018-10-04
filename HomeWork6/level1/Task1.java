package com.gmail.yuramitryahin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task1 {

	public static void main(String[] args) {
	String d;
	int month;
	long sec;
	Date date=new Date();
	Calendar cln = Calendar.getInstance();
	
	SimpleDateFormat form = new SimpleDateFormat("dd.MM.y");
	
    month=cln.get(Calendar.MONTH)-1;
    cln.set(Calendar.MONTH, month);
	
    sec=date.getTime()-cln.getTimeInMillis();
	
	System.out.println(sec);

	}
}
