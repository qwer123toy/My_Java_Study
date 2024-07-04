import java.time.LocalDate;
import java.util.Arrays;

public class TestHoliday {
	public static void main(String[] args) {
		Holiday[] days = {new Holiday("��ź��", LocalDate.of(2024, 12, 25)),
				new Holiday("�ѱ۳�", LocalDate.of(2024, 10, 9)),
				new Holiday("��̳�", LocalDate.of(2024, 5, 5))
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
