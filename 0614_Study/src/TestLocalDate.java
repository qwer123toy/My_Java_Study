import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestLocalDate {
	public static void main(String[] args) {
		// 변경 불가
		LocalDate now = LocalDate.now();
		System.out.println(now.toString());
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue());
		
		LocalDate tomorrow = now.plusDays(1);
		System.out.println(tomorrow);
		
		System.out.println(tomorrow);
		LocalDate lastDay = LocalDate.of(2024, 12, 31);
		System.out.println(lastDay);
		
		LocalDate parsing = LocalDate.parse("2024-10-25");
		System.out.println(parsing);
		
	}
}
