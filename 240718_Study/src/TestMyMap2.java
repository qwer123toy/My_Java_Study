import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMyMap2 {
	public static void main(String[] args) {
		// 위도, 경도 = 도시명
		// 59, 18 = 스톡홀름
		// 31, 121 = 상하이
		// 22, 114 = 홍콩
		// 35, 139 = 도쿄

		Map<MyLocation, String> map = new HashMap<>();
		map.put(new MyLocation(59, 18), "스톡홀름");
		map.put(new MyLocation(31, 121), "상하이");
		map.put(new MyLocation(22, 114), "홍콩");
		map.put(new MyLocation(35, 139), "도쿄");
		Set<MyLocation> keySet = map.keySet();
		
		for(MyLocation key : keySet) {
			String value = map.get(key);
			System.out.println(value);
		}

	}
}
