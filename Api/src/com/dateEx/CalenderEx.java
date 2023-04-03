package com.dateEx;

import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int momth = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH); 	// 일을 리턴
		int week = now.get(Calendar.DAY_OF_WEEK); 	// 요일 리턴
		int amap = now.get(Calendar.AM_PM);			// 오전/오후 리턴
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(momth );
		System.out.println(day);
		
		System.out.println(week);
		System.out.println(amap);
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		switch (week) {
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;

		default:
			break;
		}
		if(amap == Calendar.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
	}

}
