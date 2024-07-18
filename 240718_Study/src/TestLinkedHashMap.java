import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestLinkedHashMap {
	public static void main(String[] args) {
//		Map<String, Integer> linkedMap = new LinkedHashMap<>();
//		
//		linkedMap.put("키4", 4);
//		linkedMap.put("키3", 3);
//		linkedMap.put("키1", 1);
//		
//		System.out.println(linkedMap);
		
		// 사람1
		// 이름: 길동
		// 나이: 22
		Map<String, Object> person1 = new LinkedHashMap<>();
		person1.put("이름", "길동");
		person1.put("나이", 22);
		
		// 사람2
		// 이름: 둘리
		// 점수: 100
		Map<String, Object> person2 = new LinkedHashMap<>();
		person2.put("이름", "둘리");
		person2.put("점수", 100);
		
		// 사람3
		// 이름: 도우너
		// 주소: 부산 진구
		Map<String, Object> person3 = new LinkedHashMap<>();
		person3.put("이름", "도우너");
		person3.put("주소", "부산 진구");
		
		List<Map<String, Object>> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		for (Map<String, Object> map : personList) {
			System.out.println(map);
		}
	}
}











