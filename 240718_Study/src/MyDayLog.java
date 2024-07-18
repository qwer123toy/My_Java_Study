import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Diary {
	String weather;
	String detail;

}

public class MyDayLog {//쉐이크 하나, 견과류, 계란2개, 치킨텐더 샐러드
	public static void main(String[] args) {
		// 날짜, 일기 내용
		// 24-07-18, 날씨: 맑음, 내용: 맵을 배움
		// 24-07-17, 날씨: 비, 내용: 춘식이 생일
		// 24-08-15, 날씨: 구름, 내용: 광복절

		Map<LocalDate, String> diary = new HashMap<>();
		// 24-07-18, 날씨: 맑음, 뒤늦게 삼계탕을 먹음
		diary.put(LocalDate.of(2024, 7, 18), "맵을 배움");
		Map<LocalDate, List<String>> diary2 = new HashMap<>();

		Map<LocalDate, Diary> diary3 = new HashMap<>();

		Map<LocalDate, Map<String, Object>> diary4 = new HashMap<>();

	}
}
