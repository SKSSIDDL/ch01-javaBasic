package kr.s31.calendar;

import java.util.Calendar;

public class CalendarMain01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		                     //클래스명  상수명
		int year = today.get(Calendar.YEAR); //연도
		int month = today.get(Calendar.MONTH)+1; //월(0~11) -> **+1** -> 1~12
		int date = today.get(Calendar.DATE); //일
		
		System.out.printf("%d년 %d월 %d일 ", year, month, date);		
		
		int day = today.get(Calendar.DAY_OF_WEEK); //요일(1~7)-> **-1** -> 0~6
		
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		                 //0    1    2    3     4    5     6
		System.out.print(days[day-1]+"요일");
		
		int amPm = today.get(Calendar.AM_PM); //오전 0 오후 1
		String str = amPm == Calendar.AM ? "오전" : "오후";
		
		//0~11, 정오와 자정은 12 아니라 0으로 표시됨 
		int hour = today.get(Calendar.HOUR); //시, 24시 사용하고 싶으면 HOUR_OF_DAY
		int min = today.get(Calendar.MINUTE); //분
		int sec = today.get(Calendar.SECOND); //초
		System.out.printf(" %s %d시%d분%d초", str, hour, min, sec);
		
	}
}
