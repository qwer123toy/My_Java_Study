import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapIteration2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		// 각 쌍을 저장 하며 key,value 값으로 저장

		map.put("D", "디");
		map.put("C", "씨");
		map.put("A", "에이");
		map.put("B", "비");
		map.put("E", "이");
		System.out.println(map);

		Set<Entry<String, String>> entrySet = map.entrySet();

		// 맵에 있는 모든 키-값 쌍을 Set으로 반환, 각 요소는 Map.Entry 객체
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}

		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}
}
