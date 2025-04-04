package ch07.unit09;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex04 {
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println("현재 : " + today);
		
		// 년도 변경
		LocalDateTime localDate2 = today.withYear(2026);
		// 월 변경
		localDate2 = localDate2.withMonth(5);
		// 일 변경
		localDate2 = localDate2.withDayOfMonth(5);
		System.out.println(localDate2);				
		
		// 직접 변경
		LocalDateTime localDate3 = today
				.withYear(2025)
				.withMonth(6)
				.withDayOfMonth(10)
				.withHour(10)
				.withMinute(15)
				.withSecond(10);
		System.out.println("변경 후 : " + localDate3);
		
		// 상대적 변경
		// 이번해의 첫일
		localDate3 = today.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번해의 첫일 : " + localDate3);
		
		// 이번해의 마지막일
		localDate3 = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번해의 마지막일 : " + localDate3);
		
		// 다음해의 첫일
		localDate3 = today.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음해의 첫일 : " + localDate3);
		
		// 이달의 첫일
		localDate3 = today.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이달의 첫일 : " + localDate3);
		
		// 이번달의 첫 월요일
		localDate3 = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번달의 첫 월요일 : " + localDate3);
		
		// 돌아오는 월요일
		localDate3 = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일 : " + localDate3);
		
		// 오늘을 포함한 돌아오는 월요일
		localDate3 = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
		System.out.println("오늘을 포함한 돌아오는 월요일 : " + localDate3);
				
		// 지난 월요일
		localDate3 = today.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : " + localDate3);
		
		// 오늘을 포함한 지난 월요일
		localDate3 = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("오늘을 포함한 지난 월요일 : " + localDate3);
		
	}
	
}
