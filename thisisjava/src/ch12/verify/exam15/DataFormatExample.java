package ch12.verify.exam15;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2022, 12, 30, 0, 0, 0);
		
		long remainDay = now.until(endDateTime, ChronoUnit.DAYS);
		System.out.println(remainDay);

	}
}
