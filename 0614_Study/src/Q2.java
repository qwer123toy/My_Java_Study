import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/*
	1. 캡슐화? 객체의 데이터(속성)와 그 데이터를 처리하는 메서드(기능)를 하나의 단위로 묶고, 외부에서 직접 접근하지 못하도록 제한하는 것
	2. 정보은닉? 객체의 내부 상태를 외부로부터 숨기고, 외부에서 접근할 수 없도록 제한
	3. 접근제한자? public, private의 차이점? 접근제한자란 클래스, 메소드, 변수 등에 대한 접근 권한을 제어하는데 사용됨
		Private - 선언된 클래스 내에서만 접근 가능, 다른 클래스에서는 불가능
		Public - 모든 클래스에서 접근 가능
	4. Library? 특정한 기능이나 메소드들이 저장되어 있는 곳
	5. instance method와 static method 호출 시 달랐던 점?
	 	instance method - 객체의 상태를 조작하거나 관련된 작업을 수행, 인스턴스를 생성해야만 호출 가능
	 	static method - 클래스 자체에 속하며 객체 상태와 무관하게 동작함, 인스턴스 생성 없이 클래스 이름을 통해 호출 가능
*/
public class Q2 {
	public static void main(String[] args) {
		// 변경 불가
		LocalDate now = LocalDate.now();
		//now= now.plusDays(2);

		for (int i = 2; i < 9; i++) {

			LocalDate weeks = now.plusDays(i);
			String week = weeks.getDayOfWeek().toString();
			System.out.print(week.substring(0, 3) + "  ");
		}
		for (int i = -19; i < 17; i++) {
			if ((i - 2) % 7 == 0) {
				System.out.println();
			}

			LocalDate weeks = now.plusDays(i);
			if (weeks.getMonth().getValue() == 6) {
				int day = Integer.valueOf(weeks.getDayOfMonth());
				System.out.printf("%02d   ", day);
			} else {
				System.out.print("     ");
			}

		}

	}
}
