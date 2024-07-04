import java.time.LocalDate;
import java.util.Arrays;

public class TestHoliday {
	public static void main(String[] args) {
		Holiday[] days = {new Holiday("성탄절", LocalDate.of(2024, 12, 25)),
				new Holiday("한글날", LocalDate.of(2024, 10, 9)),
				new Holiday("어린이날", LocalDate.of(2024, 5, 5))
		};
		Arrays.sort(days);
		
		for(Holiday h : days) {
			System.out.println(h);
		}
		
		System.out.println();
		Arrays.sort(days, new NameComparator());
		
		for(Holiday h : days) {
			System.out.println(h);
		}
	}
}
