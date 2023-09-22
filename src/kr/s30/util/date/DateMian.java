package kr.s30.util.date;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateMian {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toString()); //Object의 toString으로 재정의
		
		System.out.println("------------------------------");
		
		//deprecated 되어 사용하지 않음
		System.out.println(now.toLocaleString());
		System.out.println("------------------------------");
		
		DateFormat df = DateFormat.getInstance(); //매서드 호출로 객체 생성(getInstance 안에서)
		String today = df.format(now);
		System.out.println(today);
		System.out.println("------------------------------");
		
		df = DateFormat.getDateTimeInstance();
		today =df.format(now);
		System.out.println(today);
		System.out.println("------------------------------");

		df = DateFormat.getDateInstance(); //날짜만
		today = df.format(now);
		System.out.println(today);
		System.out.println("------------------------------");
		
		df = DateFormat.getTimeInstance(); //시간만
		today = df.format(now);
		System.out.println(today);
		System.out.println("------------------------------");
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh:mm:ss");
		today = sf.format(now);
		System.out.println(today);
		
	}
}
