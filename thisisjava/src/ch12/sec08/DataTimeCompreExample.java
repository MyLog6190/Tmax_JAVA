package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataTimeCompreExample {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a HH:mm:ss");
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 1, 0, 0);
		System.out.println(dtf.format(startDateTime));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 30, 1, 0, 0);
		System.out.println(dtf.format(endDateTime));
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행중");
		}else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료");
		}else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료 후");
		}
		
		//남은 기간
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		System.out.println(remainYear);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		System.out.println(remainMonth);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		System.out.println(remainDay);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		System.out.println(remainHour);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		System.out.println(remainMonth);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		System.out.println(remainSecond);
		
	}
}
