package control;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2025, 6-1, 1);
		// 0부터 시작이라서 구하고자 하는 월 -1을 해야함
		int week = c.get(Calendar.DAY_OF_WEEK);
		// 달력의 요일을 구함
		System.out.println(week);
		int end = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 달력의 최대 날짜를 구함
		System.out.println(end);
	}
}
