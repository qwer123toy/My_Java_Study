import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
/*
1. Calendar 또는 LocalDate를 사용해서 특정 달의 마지막 일 수를 찾아보세요.
	1월, 3월 ... => 31 / 4월, 6월 => 30

2. 이번 달의 달력을 출력하기
2024-06-14 금
일	월	화	수	목	금	토
						01	
02	03	04	05	06	07	08	
09	10	11	12	13	14	15	
16	17	18	19	20	21	22	
23	24	25	26	27	28	29	
30
*/
public class Q1 {
	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		LocalDate month1 = now.minusMonths(5).minusDays(13);
		LocalDate month2 = month1;
		int checkdays = 0;
		int checkMonth = 0;
		for (int i = 1; i <= 366; i++) {

			month2 = month1.plusDays(i);

			if (month2.getDayOfMonth() == 1) {
				checkdays = month2.minusDays(1).getDayOfMonth();
				checkMonth = month2.minusDays(1).getMonth().getValue();
				System.out.println(checkMonth + "월의 마지막 일은 " + checkdays + "일입니다.");
			}

		}

	}
}
